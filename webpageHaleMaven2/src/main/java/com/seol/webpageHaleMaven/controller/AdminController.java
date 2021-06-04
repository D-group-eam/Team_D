package com.seol.webpageHaleMaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seol.webpageHaleMaven.dao.MemberDao;
import com.seol.webpageHaleMaven.entity.Member;
import com.seol.webpageHaleMaven.service.MemberService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private MemberService memberService;
	
	
	@GetMapping("/")
	public String showSystemMode(){
		return "adminPage";
	}
	
	@GetMapping("/memberList")
	public String showMemberList(Model theModel) {
		List<Member> theMembers =  memberService.getMember();
		theModel.addAttribute("members", theMembers);
		return "adminMemberList";
	}
}
