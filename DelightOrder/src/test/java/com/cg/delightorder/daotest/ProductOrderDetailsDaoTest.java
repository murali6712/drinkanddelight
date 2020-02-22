package com.cg.delightorder.daotest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.cg.delightorder.dao.ProductOrderDetails;
import com.cg.delightorder.dto.PlaceAnOrder;
import com.cg.delightorder.util.ProductOrderRepository;

public class ProductOrderDetailsDaoTest {
	ProductOrderDetails detailsObject = new ProductOrderDetails();
	ProductOrderRepository orderRepository = new ProductOrderRepository();
	
	@Test
	public void viewOrderTest()
	{
		List<PlaceAnOrder> Original = detailsObject.getOrderDetailsDao();
		List<PlaceAnOrder> Expected = orderRepository.getOrderDetails();
		assertEquals(Expected,Original);
		
	}
}
