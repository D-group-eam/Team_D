package com.seol.webpageHaleMaven.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.seol.webpageHaleMaven.entity.Item;
import com.seol.webpageHaleMaven.entity.ItemDTO;
import com.seol.webpageHaleMaven.service.ItemService;

import net.coobird.thumbnailator.Thumbnails;

@Controller
@RequestMapping("/shop")
public class ShopController {
	
	@Autowired
	private ItemService itemServcie;

//uploadDirResouce 이름을 가진 빈을 root-context.xml에서 가져온다. 업로드 경로
	
	@Autowired
	private FileSystemResource uploadDirResource;
	
	private Logger logger = Logger.getLogger(getClass().getName());


//아이템 상세 페이지
	@PostMapping("/{itemId}")
	public String showDetailPage(@PathVariable("itemId")int itemId, Model theModel) {
		
		//아이템 객체 가져오기
			//아이템 아이디로 옵션 객체를 가져온다.
		
			//옵션객체를 아이템 객체에 집어 넣는다.
		
		//뷰에 쏜다.
		
		
		theModel.addAttribute("idTest", itemId);
		
		
		
		return "shop-detail";
	}
	
	
//등록 페이지 보여주기
	@GetMapping("/addItem")
	public String addItemPage(Model theModel) {
		theModel.addAttribute("item", new Item());
		return "item-registration-form";
	}
	
	
	
	@RequestMapping("/addItemProcessing2")
	public String addItemProcessing2(
			/*
			 * @RequestParam("mit_file") MultipartFile imageFile,
			 */			  HttpServletRequest req,
			  @ModelAttribute("item") ItemDTO theItem, 
			Model theModel,
			Principal principal) throws UnsupportedEncodingException
	{
		
		/*
		 * theItem.setMit_file(imageFile);
		 */		
		
			logger.info("=====>파일 이름 dsfsdf" + theItem);

		return "home";
		
	}
	
	@PostMapping("/addItemProcessing")
	public String addItemProcessing(
			@RequestParam("mit_file") MultipartFile imageFile,
			  HttpServletRequest req,
			  @ModelAttribute("item") ItemDTO theItem, 
			Model theModel,
			Principal principal)
	{
		
		FileOutputStream fos = null;  
		/* 필드 중에 멀티파트 부분만 가져간다. */
		//파일 필드 인자 버그 패치
		// 아이템 DTO에 입력한다. 
		theItem.setMit_file(imageFile);
		
		MultipartFile files = theItem.getMit_file();
		//파일 명 인자 전송용
		String fileNames = null;
		//썸네일 파일 인자 전송용
		String thumbFileNames = null;
		
		logger.info("=====>파일 업로드 " + files.getOriginalFilename());

		logger.info("=====>파일 비어있는지 " + files.isEmpty());

		 // 파일(들) 유효성 점검
		if  (!theItem.getMit_file().isEmpty() &&  
                  files != null) {
			  
		logger.info("=====>업로드 파일 갯수 " + files.getSize());
		
		String tmpFileName = "";  
        String tmpFileExt = "";    
			
       
        tmpFileName = files.getOriginalFilename();
        tmpFileExt = tmpFileName.substring(tmpFileName.lastIndexOf(".") + 1, tmpFileName.length());
        
        logger.info("=====>파일 확장자 : " + tmpFileName + "." + tmpFileExt);
       // 그림 확장자 검사 
        if  (tmpFileExt.equalsIgnoreCase("JPG") ||   
                tmpFileExt.equalsIgnoreCase("JPEG") ||  
                tmpFileExt.equalsIgnoreCase("PNG") ||  
                tmpFileExt.equalsIgnoreCase("GIF")) {      
        
        	logger.info("=====>그림 확장자 이용 가능" );
        	
        // 파일 인자 저장    
        	fileNames = tmpFileName;

        //저장소에 저장한다.         	
        	try {
        		byte[] bytes = files.getBytes();
        		File outFileName = new File(uploadDirResource.getPath() + tmpFileName);
        		//썸네일 경로
        		String thumbPath = uploadDirResource.getPath() + "thumbnail/";
        		//썸네일 파일 이름 
        		String thumbPathFileName = "thumb_" + tmpFileName.split("\\.")[0] + ".png" ;
        		
        		fos = new FileOutputStream(outFileName);
        		fos.write(bytes);  
        	    File thumbnail = new File(thumbPathFileName);   
     
                Thumbnails.of(outFileName)  
                             .size(200, 100)  
                             .outputFormat("png")  
                             .toFile(thumbPath + thumbnail);  
         //썸네일 파일 인자 저장
                thumbFileNames = thumbPathFileName;
        		
        	}catch(IOException e) {
            	logger.info("=====> FileUploadController save IOE" );
            	e.printStackTrace();

        	}finally {
            	logger.info("=====>그림 파일 저장 완료" );
        	}
		 }//그림 확장자 검사 
        else {
        	
        	logger.info("=====>그림 파일이 아닙니다." );
            return "/error/image_error";  
        }
		}else {
			
        	logger.info("=====>파일 타입 에러" );
		}
		theModel.addAttribute("files", fileNames);
		theModel.addAttribute("thumbFiles",thumbFileNames);
		
		//DTO를 VO로 변환한다.
		//
		
		

		Item item = theItem._toConvertItem();

		String itemName =item.getMit_name();
		
		Item existing = itemServcie.findByItemName(itemName);
		if(existing != null) { logger.info("=====>아이템 이미 존재: ");
		theModel.addAttribute("item",new Item()); return "item-registration-form"; }
		logger.info("=====>아이템이 없으니 넣겟다 ");
		
		String[] opitonName = req.getParameterValues("addText[]"); 
		String[] optionPrice = req.getParameterValues("addPrice[]");
		
		itemServcie.saveItem(item,opitonName,optionPrice,principal.getName());
		
		
		logger.info("=====>아이템 한글 테스트 " + itemName);
		//파일 업로드 부분 끝 ---------------------------------------------------------------------------------
		/*
		 * item.setMit_file(fileNames);
		 * 
		 * String itemName =theItem.getMit_name();
		 * 
		 * Item existing = itemServcie.findByItemName(itemName);
		 * 
		 * if(existing != null) { logger.info("=====>아이템 이미 존재: ");
		 * theModel.addAttribute("item",new Item()); return "item-registration-form"; }
		 * logger.info("=====>아이템이 없으니 넣겟다 ");
		 * 
		 * 
		 * String[] opitonName = req.getParameterValues("addText[]"); String[]
		 * optionPrice = req.getParameterValues("addPrice[]");
		 * 
		 * itemServcie.saveItem(item,opitonName,optionPrice,principal.getName());
		 */
		 
		return "home";
	}
	@PostMapping("/delete")
	public String deleteItem(Model theModel) {
		
		
		return "/";
	}
	
	
	
}
