package com.seol.webpageHaleMaven.controller;

import java.security.Principal;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
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
import com.seol.webpageHaleMaven.member.EditMember;
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
		logger.info("=====>Binding Result Error" + theBindingResult);

			return "memberEdit";
		}
				
	memberService.saveOrUpdate(theEditMember);
		
		return "redirect:/";
	}
//멤버 삭제하기
	@PostMapping("/deleteMember")
	public String deleteMember(@ModelAttribute("member") Member theMember) {
		
		return "redirect:/";
	}
//비밀번호 한 번 더 인증
	@GetMapping("/verifyPassword")
	public String verifyPassword()
	{
		
		return "verifyPassword";
	}
}
