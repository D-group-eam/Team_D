package com.seol.webpageHaleMaven.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seol.webpageHaleMaven.entity.Member;
import com.seol.webpageHaleMaven.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
//멤머 마이페이지	
	@GetMapping("/")
	public String showMyPage() {
		return "myPage";
	}

	
//회원정보 업데이트 페이지
	@GetMapping("/editMember")
//파라미터에서 멤버 아이디를 변수로 가져옴
	public String showForFormUpdate(@RequestParam("memberId") int theId, Model theModel) {
//파라미터로 받아온 것을 서비스레이어를 시켜서 db에 조회하여 가져옴
		Member theMember = memberService.getMember(theId);
		theModel.addAttribute("member",theMember);
		return "memberEdit";
	}
	
	
//멤버를 저장하기
	@PostMapping("/saveMember")
	public String saveMember(@ModelAttribute("member") Member theMember) {
		
		return "redirect:/";
	}
//멤버 삭제하기
	@PostMapping("/deleteMember")
	public String deleteMember(@ModelAttribute("member") Member theMember) {
		
		return "redirect:/";
	}
	
}
