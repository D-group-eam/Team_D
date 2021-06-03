package com.seol.webpageHaleMaven.controller;

import javax.validation.Valid;

import java.util.logging.Logger;
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

import com.seol.webpageHaleMaven.entity.Member;
import com.seol.webpageHaleMaven.member.CrmMember;
import com.seol.webpageHaleMaven.service.MemberService;

@Controller
@RequestMapping("/register")
public class RegistrationController {
	@Autowired
	private MemberService memberService;
	
	private Logger logger = Logger.getLogger(getClass().getName());

// input 스트링으로 들어오는 String 데이터들의 white space를 trim해주는 역할을 한다. 즉 String 앞 뒤의 white space를 제거해줌
// 모든 요청이 들어올때마다 해당 method를 거침
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
//회원가입페이지
	@GetMapping("/showRegistrationForm")
	public String showMyLoginPage(Model theModel) {
		theModel.addAttribute("crmMember", new CrmMember());
		return "registration-form";
	}

	
//회원가입처리
//@Valid는 객체에 들어가는 값을 검증해주는 어노테이션이다
//@Valid를 사용하면 @Min,@Max,@NotNull 등의 어노테이션으로 간단하게 값을 체크할 수 있다
//컨트롤러에서 view에 전달받은 값에 @Valid나 @Validated 어노테이션을 붙인다.
	@PostMapping("/processRegistrationForm")
	public String processRegistrationForm(@Valid @ModelAttribute("crmMember") CrmMember theCrmMember, BindingResult theBindingResult, Model theModel) {
		
		String memberName = theCrmMember.getMem_username();
		logger.info("=====>Processing registration form for : " + memberName);


//컨트롤러에서 에러체크는 hasErrors 함수를 이용한다.
		if (theBindingResult.hasErrors()) {
		logger.info("=====>Binding Result Error" + theBindingResult);

			return "registration-form";
		}
//이름으로 데이터베이스에서 유저를 조회한다.
		Member existing = memberService.findByUserName(memberName);	
//존재하지 않으면 회원가입 유저 클래스를 다시 만들어서 모델에 부여하고 회원가입 페이지로 이동
		if(existing != null) {
			 theModel.addAttribute("crmMember", new CrmMember());
			 theModel.addAttribute("registrationError", "아이디가 이미 존재해요");
			 
			 logger.warning("User name already exist");
			 return "registration-form";
		 }
		 
//유저를 만들어서 데이터베이스에 저장한다.
		 memberService.save(theCrmMember);
		 logger.info("Successfully created user: " + memberName);
		
		return "registration-confirmation";
		
		
	}
}
