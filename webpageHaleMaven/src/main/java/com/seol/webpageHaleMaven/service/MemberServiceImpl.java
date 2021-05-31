package com.seol.webpageHaleMaven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seol.webpageHaleMaven.dao.MemberDao;
import com.seol.webpageHaleMaven.dao.RoleDao;
import com.seol.webpageHaleMaven.entity.Member;
import com.seol.webpageHaleMaven.member.CrmMember;

//멤버 서비스 레이어 표시
@Service
public class MemberServiceImpl implements MemberService {

//멤버 DAO
	@Autowired
	private MemberDao memberDao;
	
//멤버 역할 DAO
	@Autowired
	private RoleDao roleDao;
	

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		
		return null;
	}

//유저 이름을 찾는다.
//트랜색션 기능을 자동으로 처리해주는 표시
	@Override
	@Transactional
	public Member findByUserName(String userName) {
		
//데이터베이스에 유저가 있는지 DAO에 명령한다. 이름으로 찾는다.
		return memberDao.findByMemeberName(userName);
	}


//트랜색션 기능을 자동으로 처리해주는 표시
	@Override
	@Transactional
	public void save(CrmMember CrmMember) {
		
		Member member = new Member();
		member.setMem_username(null);
		
		
	}

	
}
