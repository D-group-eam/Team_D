package com.seol.webpageHaleMaven.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seol.webpageHaleMaven.entity.Member;


//Dao 인 것을 표시함
@Repository
public class MemberDaoImpl implements MemberDao{

	
	//세션 팩토리를 만들어야 함

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Member findByMemeberName(String memberName) {

		//세션 팩토리에서 현재 hibernate 세션 생성
		Session currentSession = sessionFactory.getCurrentSession();
		
		// 매개변수로 입력된 값으로 데이터베이스에서 데이터를 읽는 쿼리
		Query<Member> theQuery = currentSession.createQuery("from Member where userName=:uName", Member.class);

		// 쿼리에 uName 에 매개변수 입력값으로 입력
		theQuery.setParameter("uName", memberName);
		
		//유저 데이터를 담은 Member 클래스를 객체 변수 하나 만듦
		Member theMember = null;

		try {
			
			// 쿼리 결과값을 객체에 넣음
			theMember = theQuery.getSingleResult();
		} catch (Exception e) {
			theMember = null;
		}
		
		//객체 반환
		return theMember;
	}

	@Override
	public void save(Member member) {

		//세션 팩토리에서 현재 hibernate 세션 생성
		Session currentSession = sessionFactory.getCurrentSession();

		//유저를 생성한다.
		currentSession.saveOrUpdate(member);
	}
}
