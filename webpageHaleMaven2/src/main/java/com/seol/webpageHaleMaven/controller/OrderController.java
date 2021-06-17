package com.seol.webpageHaleMaven.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seol.webpageHaleMaven.entity.Order;
import com.seol.webpageHaleMaven.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController { 
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	OrderService orderService;
	
	@GetMapping("/orderList")
	public String orderList(@RequestParam("nickname") String nickname, 
		@RequestParam(value="page", defaultValue="1") int page, Model model) {
		
		List<Order> orderList = orderService.getOrderList(nickname, page, 5);
		
		//페이지당 상품 5개씩 출력
		model.addAttribute("pageOrderTotalMoney", this.getOrderTotalMoney(orderList));
		model.addAttribute("orderTotalMoney", orderService.getMotTotalMoney(nickname));
		model.addAttribute("orderList", orderList );
		return "/order/order-list";
	}
	
	// 주문 합계
	private int getOrderTotalMoney(List<Order> orderList) {
		
		int sum = 0;
		for(int i = 0; i<orderList.size(); i++ ) {
			sum += orderList.get(i).getMotTotalMoney();
		} 
		
		return sum;
	}

	
}
