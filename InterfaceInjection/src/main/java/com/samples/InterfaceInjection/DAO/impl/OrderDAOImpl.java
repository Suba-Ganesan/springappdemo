package com.samples.InterfaceInjection.DAO.impl;

import com.samples.InterfaceInjection.DAO.OrderDAO;

public class OrderDAOImpl implements OrderDAO{

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAOImple.createOrder() method...");
	}

}