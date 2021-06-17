package com.seol.webpageHaleMaven.service;

import java.util.List;

import com.seol.webpageHaleMaven.entity.Order;
import com.seol.webpageHaleMaven.entity.Order;

public interface OrderService {
	
	List<Order> getOrderList(String nickname, int page, int itemsPerPage);
	
	int getMotTotalMoney(String nickname);
	

}
