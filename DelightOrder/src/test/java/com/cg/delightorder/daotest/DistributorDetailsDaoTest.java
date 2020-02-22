package com.cg.delightorder.daotest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.cg.delightorder.dao.DistributorDetailsDao;

public class DistributorDetailsDaoTest 
{
	DistributorDetailsDao distributorObject = new DistributorDetailsDao();
    Integer ArrayList[]= {1,2,3,4};
    
	@Test
	public void getDistributorDetailsDaoTest()
	{
		assertEquals("1 Harsha_Fruits_Shop Hyderabad 606712",distributorObject.getDistributorDetailsDao(1));
	}
	
	
	@Test
	public void getDistributorDetailsDaoTest1()
	{
		assertEquals(null,distributorObject.getDistributorDetailsDao(9));	
	}
	
	@Test
	public void getIdsTest()
	{
		ArrayList<Integer> list=distributorObject.getIds();
       
        assertArrayEquals(ArrayList,list.toArray());
		
	}
}
