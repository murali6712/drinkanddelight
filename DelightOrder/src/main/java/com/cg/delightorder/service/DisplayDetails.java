package com.cg.delightorder.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.delightorder.dto.PlaceAnOrder;

public interface DisplayDetails 
{
	public  Map<Integer,PlaceAnOrder> getStockDisplay = new HashMap<Integer, PlaceAnOrder>();

	Map<Integer, PlaceAnOrder> getStockDisplay();
}
