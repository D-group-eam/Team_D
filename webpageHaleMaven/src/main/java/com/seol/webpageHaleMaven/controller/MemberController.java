package com.seol.webpageHaleMaven.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seol.webpageHaleMaven.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	private Logger logger = Logger.getLogger(getClass().getName());
	@GetMapping("/")
	public String showMyPage() {
		return "myPage";
	}
}
