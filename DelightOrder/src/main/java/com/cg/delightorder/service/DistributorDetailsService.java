package com.cg.delightorder.service;

import java.util.ArrayList;

import com.cg.delightorder.dao.DistributorDetailsDao;
import com.cg.delightorder.exception.NoDataFoundException;

public class DistributorDetailsService 
{
	DistributorDetailsDao distributorDetailsObject = new DistributorDetailsDao();
	
	ArrayList<Integer> listId = new ArrayList<Integer>();
	
	public ArrayList<Integer> getId()
	{
		listId = distributorDetailsObject.getIds();
		return listId;
	}
	
	public String getDistributorDetails(Integer orderId) throws NoDataFoundException
	{
		String finalResult = null;
		for(Integer i : listId)
		{
			if(i == orderId)
			{
				finalResult = distributorDetailsObject.getDistributorDetailsDao(orderId);
			}
		}
		if(finalResult == null)
		{
			throw new NoDataFoundException("Not Valid Id");
		}
		else
		{
			return finalResult;
		}
	}
}
