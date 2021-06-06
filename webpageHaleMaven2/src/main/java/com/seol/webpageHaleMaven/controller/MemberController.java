package com.seol.webpageHaleMaven.controller;

import java.security.Principal;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seol.webpageHaleMaven.entity.Member;
import com.seol.webpageHaleMaven.member.CrmMember;
import com.seol.webpageHaleMaven.member.EditMember;
import com.seol.webpageHaleMaven.member.Password;
import com.seol.webpageHaleMaven.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
//멤머 마이페이지	
	@GetMapping("/")
	public String showMyPage(Principal principal, Model theModel) {
		
		Member theMember = memberService.findByUserName(principal.getName());
		theModel.addAttribute("theMember",theMember);
		
		return "myPage";
	}

	
//회원정보 업데이트 페이지
	@GetMapping("/editMember")
//파라미터에서 멤버 아이디를 변수로 가져옴 @RequestParam("memberId") int theId,
	public String showForFormUpdate(Model theModel, Principal principal) {
		
//파라미터로 받아온 것을 서비스레이어를 시켜서 db에 조회하여 가져옴
		Member theMember = memberService.findByUserName(principal.getName());
		theModel.addAttribute("EditMember",theMember);
		return "memberEdit";
	}
	
	
//멤버를 저장하기
	@PostMapping("/saveMember")
	public String saveMember(@Valid @ModelAttribute("EditMember") EditMember theEditMember, BindingResult theBindingResult, Model theModel) {
		
		//컨트롤러에서 에러체크는 hasErrors 함수를 이용한다.
		if (theBindingResult.hasErrors()) {
		logger.info("=====>Binding Result Error" + theBindingResult + "실패");

			return "memberEdit";
		}
				
	memberService.saveOrUpdate(theEditMember);
		
		return "redirect:/member/";
	}
//멤버 삭제하기
	@GetMapping("/deleteMember")
	public String deleteMember(@ModelAttribute("member") Member theMember) {
		
		return "redirect:/";
	}
//비밀번호 변경 페이지 열기
	@GetMapping("/changePassword")
	public String deleteMember(Model theModel) {
//비밀번호 객체에 이름을 부여하고 페이지 열기		
		theModel.addAttribute("Password", new Password());
		return "verifyPassword";
	}
	
	@PostMapping("/verifyPassword")
	public String verifyPassword(@Valid @ModelAttribute("Password") Password thePassword, BindingResult theBindingResult, Model theModel, Principal principal)
	{
//현재 접속한 유저
		String currentMemberName = principal.getName();
//유효성 검사 결과가 에러가 있으면 실패
		if (theBindingResult.hasErrors()) {
			logger.info("=====>Binding Result Error" + theBindingResult + " 비밀번호 실패");
				return "verifyPassword";
			}
//서비스 레이어를 통해서 현재 이용자 이름으로 검색하여 객체를 가져온다.
		Member existing= memberService.findByUserName(currentMemberName);
//현재 이용자의 비밀번호를 저장한다.
		String dbPassword = existing.getMem_password();
		String currentPassword = thePassword.getCurrentPassword();
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//현재 이용자 비밀번호와 비밀번호 변경 페이지에서 현재 비밀번호 값하고 비교하여 같은지 확인한다.
		if (encoder.matches(currentPassword,dbPassword))
		{
			logger.info("=====>encoder matching password ");

			memberService.savePassword(thePassword, currentMemberName);
			return "editPassword";
		}else {
			//비밀번호가 틀리면 빈 객체와 메시지를 비밀번호 변경 페이지에 보낸다. 
			
			theModel.addAttribute("Password", new Password());
			theModel.addAttribute("PasswordError", "비밀번호가 틀렸어요");
			return "verifyPassword";			
		}

	}
}
