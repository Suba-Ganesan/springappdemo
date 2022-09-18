package com.samples.InterfaceInjection.service.impl;

import com.samples.InterfaceInjection.DAO.OrderDAO;
import com.samples.InterfaceInjection.service.OrderService;

public class OrderServiceImpl implements OrderService {

	private OrderDAO orderDAO;

	public OrderDAO getOrderDAO() {
		return orderDAO;
	}

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	@Override
	public void placeOrder() {
		System.out.println("Inside OrderServiceImpl.placeOrder() method...");
		orderDAO.createOrder();
	}

}