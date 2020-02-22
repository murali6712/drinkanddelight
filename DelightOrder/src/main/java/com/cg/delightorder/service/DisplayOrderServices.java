package com.cg.delightorder.service;

import java.util.List;

import com.cg.delightorder.dao.ProductOrderDetails;
import com.cg.delightorder.dto.PlaceAnOrder;

public class DisplayOrderServices implements OrderDetails{
	ProductOrderDetails orderDetails = new ProductOrderDetails();

	@Override
	public List<PlaceAnOrder> getOrderDetailsService() {
		// TODO Auto-generated method stub
		return orderDetails.getOrderDetailsDao();
	}

}
