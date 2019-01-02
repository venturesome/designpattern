package com.venture.some.design.pattern.main;

import java.util.ArrayList;
import java.util.List;

import com.venture.some.design.pattern.Order;

public class Broker {

	private List<Order> orders = new ArrayList<Order>();
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	
	public void placeOrders() {
		
		orders.forEach(order->{
			order.execute();
		});
		
		orders.clear();
	}
}
