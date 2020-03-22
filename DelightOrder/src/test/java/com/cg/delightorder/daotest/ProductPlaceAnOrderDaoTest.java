package com.cg.delightorder.daotest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.Test;

import java.util.Map.Entry;
import com.cg.delightorder.dao.ProductPlaceAnOrderDao;
import com.cg.delightorder.dto.PlaceAnOrder;
import com.cg.delightorder.util.PlaceAnOrderRepository;

public class ProductPlaceAnOrderDaoTest {
	ProductPlaceAnOrderDao daoObject = new ProductPlaceAnOrderDao();
	PlaceAnOrderRepository orderRepository = new PlaceAnOrderRepository();
	
	@Test
	public void TestingStock()
	{
		Set<Entry<Integer,PlaceAnOrder>> original=daoObject.getOrderData().entrySet();
		  @SuppressWarnings("static-access")
		Set<Entry<Integer,PlaceAnOrder>> expected=orderRepository.getStockRepository().entrySet();
	 
		  assertEquals(expected,original); 
	}
}