package com.cg.delightorder.util;

import java.util.ArrayList;
import java.util.List;

import com.cg.delightorder.dto.PlaceAnOrder;

public class PlaceAnOrderRepository 
{
	
	static List<PlaceAnOrder> productOrderRepository = new ArrayList<PlaceAnOrder>();
	

	public static List<PlaceAnOrder> getProductOrderRepository() 
	{
		return productOrderRepository;
	}

	public static void setProductOrderRepository (List<PlaceAnOrder> productOrderRepository) {
		PlaceAnOrderRepository.productOrderRepository = productOrderRepository;
	}
	
	public boolean repository (PlaceAnOrder beanClass)
	{
		productOrderRepository.add(beanClass);
		return true;
	}
	
	
	public void displayList()
	{
		try
		{
			System.out.println(productOrderRepository.get(0).getProductOrderId()  + " " + productOrderRepository.get(0).getProductName() + 
					" " + productOrderRepository.get(0).getDistributorId() + " "+ productOrderRepository.get(0).getWarehouseId() + " "+ 
					productOrderRepository.get(0).getQuantityUnit()+ " "+ productOrderRepository.get(0).getQuantityValue()+ " "+ 
					productOrderRepository.get(0).getPricePerUnit());
		}
		catch(IndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}

	
}
