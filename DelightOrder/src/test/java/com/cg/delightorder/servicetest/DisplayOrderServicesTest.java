package com.cg.delightorder.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.cg.delightorder.dto.PlaceAnOrder;
import com.cg.delightorder.service.DisplayOrderServices;
import com.cg.delightorder.util.ProductOrderRepository;

public class DisplayOrderServicesTest {
	ProductOrderRepository orderRepository = new ProductOrderRepository();
	DisplayOrderServices orderService = new DisplayOrderServices();
	
	@Test
	public void orderServiceTest()
	{
		List<PlaceAnOrder> original = orderService.getOrderDetailsService();
		List<PlaceAnOrder> expected = orderRepository.getOrderDetails();
		assertEquals(expected,original);
	}
}
