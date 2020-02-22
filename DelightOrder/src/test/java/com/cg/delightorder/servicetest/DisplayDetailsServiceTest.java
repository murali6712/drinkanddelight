package com.cg.delightorder.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

import com.cg.delightorder.dto.PlaceAnOrder;
import com.cg.delightorder.service.DisplayDetailsService;
import com.cg.delightorder.util.PlaceAnOrderRepository;

public class DisplayDetailsServiceTest {
	DisplayDetailsService displayObject = new DisplayDetailsService();
	PlaceAnOrderRepository repositoryObject = new PlaceAnOrderRepository();
	
	@Test
	public void DisplayDetailsTest()
	{
		Set<Entry<Integer,PlaceAnOrder>> original = displayObject.getStockDisplay().entrySet();
		Set<Entry<Integer,PlaceAnOrder>> expected = repositoryObject.getStockRepository().entrySet();
		assertEquals(expected,original);
		
	}
}
