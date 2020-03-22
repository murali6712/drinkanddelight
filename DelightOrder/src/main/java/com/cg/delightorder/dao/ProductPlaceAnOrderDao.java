package com.cg.delightorder.dao;

import java.util.Map;

import com.cg.delightorder.dto.PlaceAnOrder;
import com.cg.delightorder.util.PlaceAnOrderRepository;

public class ProductPlaceAnOrderDao 
{
	
	Map<Integer, PlaceAnOrder> placeAnOrderMap ;
	public ProductPlaceAnOrderDao()
	
	{
		placeAnOrderMap = PlaceAnOrderRepository.getStockRepository();
	}
	
	public Map<Integer, PlaceAnOrder> getOrderData()
	{
		return placeAnOrderMap;
	}
}
