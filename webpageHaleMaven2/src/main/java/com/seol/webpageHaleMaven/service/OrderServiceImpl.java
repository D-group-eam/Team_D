package com.seol.webpageHaleMaven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seol.webpageHaleMaven.dao.OrderDao;
import com.seol.webpageHaleMaven.entity.Order;
import com.seol.webpageHaleMaven.entity.Order;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderDao orderDao;

	@Transactional(readOnly=true)
	@Override
	public List<Order> getOrderList(String nickname, int page, int itemsPerPage) {
		return orderDao.getOrderList(nickname, page, itemsPerPage);
	}

	@Transactional(readOnly=true)
	@Override
	public int getMotTotalMoney(String nickname) {
		return orderDao.getMotTotalMoney(nickname);
	}
	
}
