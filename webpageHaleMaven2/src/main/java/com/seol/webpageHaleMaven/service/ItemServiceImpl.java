package com.seol.webpageHaleMaven.service;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seol.webpageHaleMaven.dao.ItemDao;
import com.seol.webpageHaleMaven.dao.ItemDetailDao;
import com.seol.webpageHaleMaven.dao.MemberDao;
import com.seol.webpageHaleMaven.entity.Item;
import com.seol.webpageHaleMaven.entity.ItemDTO;
import com.seol.webpageHaleMaven.entity.ItemDetail;


@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	private ItemDetailDao itemDetailDao;

	@Autowired
	private MemberDao memberDao;
	
	@Override
	@Transactional
	public void saveItem(Item item, String[] optionNameList, String[] optionPriceList, String userName) {

		logger.info("=====>서비스에서 아이템을 저장하기 시작 .");
		System.out.println(item + "저장하 아이템");
		System.out.println(optionNameList + "옵션 이름");
		System.out.println(optionPriceList + "옵션 가격");
		System.out.println(userName + "유저 아이디");

		//문자열을 숫자 배열로 변환
		int[] optionPriceInt = Arrays.asList(optionPriceList).stream().mapToInt(Integer::parseInt).toArray();
		
		//옵션 리스트를 객체로 만든다.
		for(int i = 0 ; i < optionNameList.length; i++)
		{
			ItemDetail tempItemDetail = new ItemDetail();
			tempItemDetail.setMem_id(memberDao.findByMemeberName(userName));
			tempItemDetail.setMidt_title(optionNameList[i]);
			tempItemDetail.setMidt_price(optionPriceInt[i]);
			tempItemDetail.setMidt_status(1);
			itemDetailDao.save(tempItemDetail);
			item.addItemDetail(tempItemDetail);
		}		
		//옵션 리스트 객체를 아이템 객체에 저장한다. 
		
		//옵션 리스트를 테이블에 저장한다.
		
		itemDao.save(item);		
		//아이템 객체를 리스트에 저장한다.. 
		
	}

	@Override
	@Transactional
	public Item findByItemName(String itemName) {
		logger.info("=====>서비스에서 아이템이 존재하는지 찾아본다. : ");
		return itemDao.findByItemName(itemName);
	}
	
	@Override
	@Transactional
	public void deleteItem(int itemId) {
		itemDao.deleteItem(itemId);
	}
}
