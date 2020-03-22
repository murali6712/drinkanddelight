package com.cg.delightorder.dao;

import java.util.List;

import com.cg.delightorder.dto.PlaceAnOrder;
import com.cg.delightorder.util.ProductOrderRepository;

public class ProductOrderDetails {
	
	ProductOrderRepository object = new ProductOrderRepository();
	
	
	public void addOrderDao(PlaceAnOrder beanClassReference )
	{
		ProductOrderRepository productRepository = new ProductOrderRepository();
		productRepository.setOrderDetails(beanClassReference);
	}
	
	public List<PlaceAnOrder> getOrderDetailsDao()
	{
		 
		return object.getOrderDetails();
	 
	}
}
