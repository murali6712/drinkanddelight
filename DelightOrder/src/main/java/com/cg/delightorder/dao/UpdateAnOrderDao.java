package com.cg.delightorder.dao;

import java.util.Map;
import java.util.Map.Entry;

import com.cg.delightorder.dto.PlaceAnOrder;
import com.cg.delightorder.exception.ProductOrderIdException;
import com.cg.delightorder.util.UpdateAnOrderRepository;

public class UpdateAnOrderDao 
{
	public boolean doesProductOrderIdExist (String productOrder) throws ProductOrderIdException
	{
		UpdateAnOrderRepository update = new UpdateAnOrderRepository();
		Map<String, PlaceAnOrder> updateOrderList = update.getUpdateOrder();
		
		for (Entry<String, PlaceAnOrder> map : updateOrderList.entrySet())
		{
			if (map.getValue().getProductOrderId().contentEquals(productOrder))
			{
				return true;
			}
			else
			{
				throw new ProductOrderIdException("Invalid ProductOrder Id");
			}
		}
		return false;
	}
}
