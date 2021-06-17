package com.seol.webpageHaleMaven.dao;

import java.util.List;

import com.seol.webpageHaleMaven.entity.Member;

public interface MemberDao {

	
	Member findByMemeberName(String memberName);
	
	void save(Member member);

	List<Member> getMember();

	Member getMember(int theId);

	void deleteMember(String name);
	
}
