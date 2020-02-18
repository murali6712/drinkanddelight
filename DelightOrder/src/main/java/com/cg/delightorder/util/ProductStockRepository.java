package com.cg.delightorder.util;

import java.util.LinkedHashMap;
import java.util.Map;

import com.cg.delightorder.dto.PlaceAnOrder;

public class ProductStockRepository 
{
	Map<Integer, PlaceAnOrder> stockrepository = new LinkedHashMap<Integer, PlaceAnOrder>();
	
	public void setProductData()
	{
		stockrepository.put(1, new PlaceAnOrder("Apple", "ABC6712", "11606712", 99.9, "10", 15.5));
		stockrepository.put(2, new PlaceAnOrder("Mango", "ABC6713", "11606713", 45.8, "20", 3.50));
		stockrepository.put(3, new PlaceAnOrder("Lemon", "ABC6714", "11606714", 10.2, "14", 4.00));
		stockrepository.put(4, new PlaceAnOrder("Kiwwi", "ABC6715", "11606715", 54.8, "70", 25.25));
		stockrepository.put(5, new PlaceAnOrder("Berry", "ABC6716", "11606716", 48.5, "100", 5.00));
	}
	
	public void getProductData()
	{
		System.out.println("keyValue       Product \t    DistributorId \t WarehouseId\tqValue\tqUnit\tPricePerUnit");
		for(Map.Entry<Integer, PlaceAnOrder> value : stockrepository.entrySet())
		{
			System.out.println(value.getKey()+"		"+value.getValue().getProductName() + " 		"+ value.getValue().getDistributorId() + " 	" 
					+ value.getValue().getWarehouseId()+ " 	"+value.getValue().getQuantityValue() + " 	" 
					+value.getValue().getQuantityUnit()+" 	"+value.getValue().getPricePerUnit());
		}
	}
	
	public Map<Integer, PlaceAnOrder> getStock()
	{
		return stockrepository;
	}
	
}
