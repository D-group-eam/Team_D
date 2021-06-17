package com.seol.webpageHaleMaven.dao;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seol.webpageHaleMaven.entity.ItemDetail;
import com.seol.webpageHaleMaven.entity.Member;


@Repository
public class ItemDetailDaoImpl implements ItemDetailDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	private Logger logger = Logger.getLogger(getClass().getName());

	@Override
	public void save(ItemDetail theItemDetail) {
		logger.info("=====>아이템 디테일 다오 저장 시작  : ");
		System.out.println(theItemDetail.getMidt_title());

		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theItemDetail);
	}

	@Override
	public List<ItemDetail> findItemDetailById(int itemId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<ItemDetail> theQuery = currentSession.createQuery("from Item_detail where mit_id=:itemId",ItemDetail.class);
		theQuery.setParameter("itemId", itemId);
		List<ItemDetail> ItemDetails= theQuery.getResultList();
		return ItemDetails;
	}

	
}
