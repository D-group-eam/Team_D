package com.seol.webpageHaleMaven.dao;

import com.seol.webpageHaleMaven.entity.Member;

public interface MemberDao {

	
	Member findByMemeberName(String memberName);
	
	void save(Member member);
	
}
