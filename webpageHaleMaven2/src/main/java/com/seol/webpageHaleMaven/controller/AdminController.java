package com.seol.webpageHaleMaven.controller;

import java.security.Principal;
import java.util.List;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seol.webpageHaleMaven.dao.MemberDao;
import com.seol.webpageHaleMaven.entity.Member;
import com.seol.webpageHaleMaven.member.EditMember;
import com.seol.webpageHaleMaven.service.MemberService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private MemberService memberService;
	
	private Logger logger = Logger.getLogger(getClass().getName());

	
	@GetMapping("/")
	public String showSystemMode(){
		return "adminPage";
	}
	
	@GetMapping("/memberList")
	public String showMemberList(Model theModel) {
		List<Member> theMembers =  memberService.getMember();
		EditMember theEditMember = new EditMember();
		theModel.addAttribute("EditMember", theEditMember);
		theModel.addAttribute("members", theMembers);
		return "adminMemberList";
	}
	
	
	
	@PostMapping("/saveMember")
	public String saveMember(@Valid @ModelAttribute("EditMember") EditMember theEditMember, BindingResult theBindingResult, Model theModel) {

		if (theBindingResult.hasErrors()) {
			logger.info("=====>Binding Result Error" + theBindingResult + "실패");
				theModel.addAttribute("msg","등록 실패");
				theModel.addAttribute("url","/admin/memberList");
				
				return "redirect";
				}
		memberService.saveOrUpdate(theEditMember);
		
		return "redirect:/admin/memberList";
	}
	
	
	@GetMapping("/delete/{userName}")
	public String deleteMember(@PathVariable("userName") String theUserName,  Model theModel) {
		System.out.println("@@@@@@@@@"+theUserName);
		
		memberService.deleteMember(theUserName);
			
		return "redirect:/admin/memberList";
	}	
		
	
	
	@GetMapping("/ItemList")
	public String itemList(Model theModel) {
		/* List<Item> theItems = */
		return "adminItemList";
	}
	
	/*
	 * @PostMapping("/saveEditMember") public String
	 * saveEditMember(@ModelAttribute("member") Member theEditMember, BindingResult
	 * theBindingResult, Model theModel) {
	 * 
	 * if (theBindingResult.hasErrors()) { logger.info("=====>Binding Result Error"
	 * + theBindingResult + "실패");
	 * 
	 * return "memberEdit"; }
	 * 
	 * memberService.saveOrUpdate(theEditMember);
	 * 
	 * return "redirect:/admin/memberList"; }
	 */
}
	
