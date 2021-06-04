package com.seol.webpageHaleMaven.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.seol.webpageHaleMaven.entity.Member;
import com.seol.webpageHaleMaven.member.CrmMember;
import com.seol.webpageHaleMaven.member.EditMember;

public interface MemberService extends UserDetailsService {
	
	Member findByUserName(String userName);
	/* 유저 이름으로 찾기 */
	
	void save(CrmMember CrmUser);
	/*  을 통해서 유저 정보를 저장한다. */

	List<Member> getMember();

	Member getMember(int theId);

	void saveOrUpdate(EditMember EditMember);
}
