package com.seol.webpageHaleMaven.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.seol.webpageHaleMaven.entity.Member;
import com.seol.webpageHaleMaven.member.CrmMember;

public interface MemberService extends UserDetailsService {
	
	Member findByUserName(String userName);
	/* 유저 이름으로 찾기 */
	
	void save(CrmMember CrmUser);
	/*  을 통해서 유저 정보를 저장한다. */
}
