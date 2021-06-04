package com.seol.webpageHaleMaven.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seol.webpageHaleMaven.dao.MemberDao;
import com.seol.webpageHaleMaven.dao.RoleDao;
import com.seol.webpageHaleMaven.entity.Member;
import com.seol.webpageHaleMaven.entity.Role;
import com.seol.webpageHaleMaven.member.CrmMember;
import com.seol.webpageHaleMaven.member.EditMember;

//멤버 서비스 레이어 표시
@Service
public class MemberServiceImpl implements MemberService {
	private Logger logger = Logger.getLogger(getClass().getName());

//멤버 정보 DAO
	@Autowired
	private MemberDao memberDao;
	
//멤버 역할 정보 DAO
	@Autowired
	private RoleDao roleDao;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	
//유저 이름을 찾는다.
//트랜색션 기능을 자동으로 처리해주는 표시
	@Override
	@Transactional
	public Member findByUserName(String memberName) {
		
//데이터베이스에 유저가 있는지 DAO에 명령한다. 이름으로 찾는다.
		return memberDao.findByMemeberName(memberName);
	}
//멤버 전체 불러오기
	@Override
	@Transactional
	public List<Member> getMember(){
		
		return memberDao.getMember();
	}
//아이디로 멤버 가져오기
	@Override
	@Transactional
	public Member getMember(int theId) {
		return memberDao.getMember(theId);
	}
	
//멤버 저장하기
//마이페이지에서 수정한 것을 저장
	@Override
	@Transactional
	public void saveOrUpdate(EditMember EditMember) {
		Member member = memberDao.findByMemeberName(EditMember.getMem_username());
		member.setMem_nickname(EditMember.getMem_nickname());
		member.setMem_email(EditMember.getMem_email());
		
		
		
		
		
	}

//트랜색션 기능을 자동으로 처리해주는 표시
	@Override
	@Transactional
//회원가입 양식에서 오는 정보와 기타 정보를 이용하여 멤버를 데이터베이스에 저장한다. 
	public void save(CrmMember CrmMember) {
//멤버 객체 생성
		Member member = new Member();
		
		member.setMem_username(CrmMember.getMem_username());
		
		member.setMem_password(passwordEncoder.encode(CrmMember.getMatchingMem_password()));
		
		member.setMem_nickname(CrmMember.getMem_nickname());
		
		member.setMem_email(CrmMember.getMem_email());
		
		member.setMem_phone(CrmMember.getMem_phone());
		
		member.setMem_zipcode(CrmMember.getMem_zipcode());
		
		member.setMem_birthday(CrmMember.getMem_birthday());
		
		member.setMem_address1(CrmMember.getMem_address1());
		
		member.setMem_address2(CrmMember.getMem_address2());
		
		member.setMem_address3(CrmMember.getMem_address3());
		
		member.setMem_address4(CrmMember.getMem_address4());
		
		member.setMem_receive_sms(CrmMember.getMem_receive_sms());
		
		member.setMem_receive_email(CrmMember.getMem_receive_email());
//역할 클래스 객체를 리스트로서 인자에 넣는다. 
		member.setRoles(Arrays.asList(roleDao.findRoleByName("ROLE_MEMBER")));
		logger.info("=====>Processing member service for : " + member.getMem_username() + member.getRoles());

		memberDao.save(member);
	}
	
//시큐리티에 제공하기위해서 데이터베이스 유저 정보를 반환하는 함수. 
//이름으로 멤버 DAO 를 통해서 정보를 얻고 가공하여 반환.
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String memberName) throws UsernameNotFoundException {
//멤버 DAo로 유저를 찾아 받는다. 여기서는 일반 데이터
		Member member = memberDao.findByMemeberName(memberName);
		
//없으면 에러
		if(member == null) {
			throw new UsernameNotFoundException("Invalid membername or password");
		}
//이름, 패스워드, 역할을 담아서 반환, 역할은 가공함
		return new org.springframework.security.core.userdetails.User(member.getMem_username(), member.getMem_password(), mapRolesToAuthorities(member.getRoles()));
	}
	

	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}
	
	

	
}
