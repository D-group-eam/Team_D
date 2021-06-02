package com.seol.webpageHaleMaven.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seol.webpageHaleMaven.entity.Role;

//Dao 인 것을 표시함
@Repository
public class RoleDaoImpl implements RoleDao{

	
	//세션 팩토리를 만들어야 함
		@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Role findRoleByName(String theRoleName) {
		
		//세션 팩토리에서 세션 생성
		Session currentSession = sessionFactory.getCurrentSession();


		// 매개변수로 입력된 값으로 데이터베이스에서 데이터를 읽는 쿼리
		Query<Role> theQuery = currentSession.createQuery("from Role where role_name=:roleName", Role.class);
		
		// 쿼리에 roleName 에 매개변수 입력값으로 입력
		theQuery.setParameter("roleName", theRoleName);
		
		//역할 데이터를 담은 Role 클래스를 객체 변수 하나 만듦
		Role theRole = null;
		
		try {
			
		// 쿼리 결과값을 객체에 넣음
			theRole = theQuery.getSingleResult();
		} catch (Exception e) {
			theRole = null;
		}
		
		//객체 반환
		return theRole;
		
	}
	
	
}
