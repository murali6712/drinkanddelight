package com.cg.delightorder.servicetest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.cg.delightorder.exception.NoDataFoundException;
import com.cg.delightorder.service.DistributorDetailsService;

public class DistributorDetailsServiceTest 
{
	DistributorDetailsService distributorObject = new DistributorDetailsService();
	Integer ArrayList[] = {1,2,3,4};
	
	@Test
	public void getDistributorDetailsServiceTest()
	{
		try
		{
			assertEquals("1 Harsha_Fruits_Shop Hyderabad 606712", distributorObject.getDistributorDetails(1));
		}
		catch(NoDataFoundException e)
		{
			
		}
	}


	@Test  
	public void getDistributorDetailsSeriviceTest1() 
	{
		  Throwable exception =assertThrows(
				  NoDataFoundException.class,()->{
					  distributorObject.getDistributorDetails(9);
	              }	  
		  );
		  assertEquals("Not Valid Id",exception.getMessage());
	}
	  
	@Test
	public void testgetId()
	{
		 ArrayList<Integer>list= distributorObject.getId();
		 assertArrayEquals(ArrayList,list.toArray());  
	}
}
