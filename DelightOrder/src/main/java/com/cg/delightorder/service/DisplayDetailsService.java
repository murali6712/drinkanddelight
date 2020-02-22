package com.cg.delightorder.service;

import java.util.Map;

import com.cg.delightorder.dao.ProductOrderDetails;
import com.cg.delightorder.dao.ProductPlaceAnOrderDao;
import com.cg.delightorder.dto.PlaceAnOrder;

public class DisplayDetailsService implements DisplayDetails{
	
	ProductPlaceAnOrderDao orderObject = new ProductPlaceAnOrderDao();
	
	Map<Integer,PlaceAnOrder> orderMap = orderObject.getOrderData();

	@Override
	public Map<Integer, PlaceAnOrder> getStockDisplay() {
		// TODO Auto-generated method stub
		return orderMap;
	}

}
