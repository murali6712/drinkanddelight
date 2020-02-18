package com.cg.delightorder.dao;

import com.cg.delightorder.dto.PlaceAnOrder;
import com.cg.delightorder.util.PlaceAnOrderRepository;

public class ProductPlaceAnOrderDao 
{
	public boolean addPlaceOrder (PlaceAnOrder beanClass)
	{
		PlaceAnOrderRepository productOrderRepository = new PlaceAnOrderRepository();
		return (productOrderRepository.repository(beanClass));
	}
	
}
