package com.cg.delightorder.service;

import com.cg.delightorder.dao.UpdateAnOrderDao;
import com.cg.delightorder.exception.ProductOrderIdException;

public class UpdateAnOrderService implements UpdateOrderService
{
	UpdateAnOrderDao updateProductOrder = new UpdateAnOrderDao();

	public boolean doesProductOrderIdExist(String productOrder) 
	{
		// TODO Auto-generated method stub
		try
		{
			return updateProductOrder.doesProductOrderIdExist(productOrder);
		}
		catch (ProductOrderIdException e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
}
