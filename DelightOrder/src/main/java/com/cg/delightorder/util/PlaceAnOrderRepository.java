package com.cg.delightorder.util;

import java.util.LinkedHashMap;
import java.util.Map;

import com.cg.delightorder.dto.PlaceAnOrder;

public class PlaceAnOrderRepository 
{
	
	public static final Map<Integer, PlaceAnOrder> stockRepository = new LinkedHashMap<Integer, PlaceAnOrder>();
	
	static {
		stockRepository.put(1, new PlaceAnOrder("Apple", "ABC6712", "11606712", 99.9, "10", 15.5));
		stockRepository.put(2, new PlaceAnOrder("Mango", "ABC6713", "11606713", 45.8, "20", 3.50));
		stockRepository.put(3, new PlaceAnOrder("Lemon", "ABC6714", "11606714", 10.2, "14", 4.00));
		stockRepository.put(4, new PlaceAnOrder("Kiwwi", "ABC6715", "11606715", 54.8, "70", 25.25));
		stockRepository.put(5, new PlaceAnOrder("Berry", "ABC6716", "11606716", 48.5, "100", 5.00));
	}
	
	public static Map<Integer, PlaceAnOrder> getStockRepository()
	{
		return stockRepository;
		
	}
	
} 
