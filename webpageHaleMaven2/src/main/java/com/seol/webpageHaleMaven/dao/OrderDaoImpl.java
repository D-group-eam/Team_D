package com.seol.webpageHaleMaven.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seol.webpageHaleMaven.entity.Order;
import com.seol.webpageHaleMaven.entity.Order;
import com.seol.webpageHaleMaven.entity.OrderPage;

@Repository
public class OrderDaoImpl implements OrderDao {
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<Order> getOrderList(String nickname, int page, int itemsPerPage) {
		
		OrderPage orderPage = new OrderPage();
		orderPage.setNickname(nickname);
		orderPage.setPage(page);
		orderPage.setItemsPerPage(itemsPerPage);
		orderPage.setStartNum((page-1)*itemsPerPage);
		
		return sqlSession.selectList("mapper.Order.getOrderList", orderPage);
	}

	@Override
	public int getMotTotalMoney(String nickname) {
		return sqlSession.selectOne("mapper.Order.getMotTotalMoney", nickname);
	}

}
