package com.seol.webpageHaleMaven.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.seol.webpageHaleMaven.entity.Member;
import com.seol.webpageHaleMaven.service.MemberService;


//커스터마이징한 로그인 인증성공 핸들러이다. 상속받아서 바꾼다.
@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	@Autowired
	private MemberService memberService;

//성공했을 경우
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		System.out.println("\n\nIn customAuthenticationSuccessHandler\n\n");
		String memberName = authentication.getName();
		System.out.println("userName=" + memberName);
	
//이름을 입력하고 멤버 서비스를 통해서 멤버 객체를 가져온다.
		Member theMember = memberService.findByUserName(memberName);
		
//현재 세션
		HttpSession session = request.getSession();
		session.setAttribute("member", theMember);

		
//홈페이지로 간다.
		response.sendRedirect(request.getContextPath() + "/");
		
		
	}
}
