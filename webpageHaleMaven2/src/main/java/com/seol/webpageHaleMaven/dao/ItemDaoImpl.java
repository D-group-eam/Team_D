package com.seol.webpageHaleMaven.dao;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seol.webpageHaleMaven.entity.Item;
@Repository
public class ItemDaoImpl implements ItemDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Logger logger = Logger.getLogger(getClass().getName());


	@Override
	public Item findByItemName(String itemName) {
		logger.info("=====>다오에서 아이템이 존재하는지 찾아본다. : ");

		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Item> theQuery = currentSession.createQuery("from Item where mit_name=:uName", Item.class);
		
		theQuery.setParameter("uName", itemName);

		Item theItem = null;
		
		try {
			
			theItem = theQuery.getSingleResult();
		}catch(Exception e) {
			theItem = null;	
		}
		return theItem;
	}

	@Override
	public void save(Item theItem) {
		logger.info("=====>아이템 저장  : ");
		System.out.println(theItem);
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theItem);
	}
	
	@Override
	public void deleteItem(int theItemId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Item where mit_id =:itemId");
		theQuery.setParameter("itemId", theItemId);
		theQuery.executeUpdate();
	}
	@Override
	public List<Item> getItem(){
		return null;
	}
}
