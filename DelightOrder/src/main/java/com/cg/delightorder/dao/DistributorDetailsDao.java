package com.cg.delightorder.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.cg.delightorder.dto.DistributorDetails;
import com.cg.delightorder.util.DistributorRepository;

public class DistributorDetailsDao 
{	
	DistributorRepository distributorDetails = new DistributorRepository();
	
	Map<Integer, DistributorDetails> detailsMap = new HashMap<Integer, DistributorDetails>();
	
	public DistributorDetailsDao()
	{
		detailsMap = DistributorRepository.getDistributorRepository();
	}
	
	public ArrayList <Integer> getIds()
	{
		ArrayList<Integer> orderList = new ArrayList<Integer>();
		for(Entry<Integer, DistributorDetails> object : detailsMap.entrySet())
		{
			orderList.add(object.getKey()); 
		}
		return orderList;
	}
	
	public String getDistributorDetailsDao(Integer id)
	{
		String finalResult = null;
		for(Entry<Integer, DistributorDetails> object : detailsMap.entrySet())
		{
			if ( id == object.getKey())
			{
				finalResult = object.getValue().getDistributorId()+ " " + object.getValue().getDistributorName() + " "+
						object.getValue().getAddress()+ " "+ object.getValue().getPhoneNumber();
			}
		}
		return finalResult;
	}
}
