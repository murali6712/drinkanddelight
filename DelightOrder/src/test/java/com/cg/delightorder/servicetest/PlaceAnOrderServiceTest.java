package com.cg.delightorder.servicetest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.delightorder.dto.PlaceAnOrder;
import com.cg.delightorder.exception.InvalidDistributorIdException;
import com.cg.delightorder.exception.InvalidPricePerUnitException;
import com.cg.delightorder.exception.InvalidProductNameException;
import com.cg.delightorder.exception.InvalidQuantityUnitException;
import com.cg.delightorder.exception.InvalidQuantityValueException;
import com.cg.delightorder.exception.InvalidWarehouseIdException;
import com.cg.delightorder.exception.NoDataFoundException;
import com.cg.delightorder.service.PlaceAnOrderService;
import com.cg.delightorder.util.PlaceAnOrderRepository;
import com.cg.delightorder.util.ProductOrderRepository;

public class PlaceAnOrderServiceTest {
	
	PlaceAnOrderService objectService = new PlaceAnOrderService();
	PlaceAnOrderRepository repositoryObject = new PlaceAnOrderRepository();
	ProductOrderRepository orderRepository = new ProductOrderRepository();
	Integer ArrayList[] = {1,2,3,4};
	
	@BeforeEach
	public void detailsListTest()
	{
		objectService.getOrderList();
	}
	
	@Test
	public void productNameTest() throws InvalidProductNameException
	{
		assertTrue(objectService.productNameValidation(4, "Mango"));
	}
	
	@Test
	public void productNameTest1() throws InvalidProductNameException
	{
	assertTrue(objectService.productNameValidation(4, "Kiwwi"));
	}
	
	
	@Test
	public void distributorIdTest() throws InvalidDistributorIdException  
	{
		assertTrue(objectService.distributorIdValidation(0, "ABC6713"));
	}
	
	
	@Test
	public void distributorIdTest1() throws InvalidDistributorIdException
	{
	assertTrue(objectService.distributorIdValidation(1, "ABC6712"));
	}
	
	
	@Test
	public void warehouseIdTest() throws InvalidWarehouseIdException  
	{
		assertTrue(objectService.wareHouseIdValidation(0, "11606713"));
	}
	
	
	@Test
	public void warehouseIdTest1() throws InvalidWarehouseIdException
	{
	assertTrue(objectService.wareHouseIdValidation(1, "11606712"));
	}
	
	
	@Test
	public void quantityValueTest() throws InvalidQuantityValueException  
	{
		assertTrue(objectService.quantityValueValidation(2, 50.0));
	}
	
	
	@Test
	public void quantityValueTest1() throws InvalidQuantityValueException
	{
	assertTrue(objectService.quantityValueValidation(1, 99.9));
	}
	
	@Test
	public void quantityUnitTest1() throws InvalidQuantityUnitException
	{
	assertTrue(objectService.quantityUnitValidation(1, "10"));
	}
	
	
	@Test
	public void pricePerUnitTest() throws InvalidPricePerUnitException
	{
	assertTrue(objectService.pricePerUnitValidation(1, 15.5));
	}
	
	@Test
	public void pricePerUnitTest1() throws InvalidPricePerUnitException
	{
	assertTrue(objectService.pricePerUnitValidation(1, 25.5));
	}
	
	
	@Test
	public void orderIdTest()
	{
	assertTrue(objectService.productOrderId("Apple", "productApple13"));
	}
	
	
	@Test
	public void DisplayDetailsTest()
	{
		Set<Entry<Integer,PlaceAnOrder>> original = objectService.getStockDisplay().entrySet();
		Set<Entry<Integer,PlaceAnOrder>> expected = repositoryObject.getStockRepository().entrySet();
		assertEquals(expected,original);
		
	}
	
	
	@Test
	public void orderServiceTest()
	{
		List<PlaceAnOrder> original = objectService.getOrderDetailsService();
		List<PlaceAnOrder> expected = orderRepository.getOrderDetails();
		assertEquals(expected,original);
	}
	
	
	@Test
	public void getDistributorDetailsServiceTest()
	{
		try
		{
			assertEquals("1 Harsha_Fruits_Shop Hyderabad 606712", objectService.getDistributorDetails(1));
		}
		catch(NoDataFoundException exception)
		{
			System.out.println(exception.getMessage());
		}
	}


	@Test  
	public void getDistributorDetailsSeriviceTest1() 
	{
		  Throwable exception =assertThrows(
				  NoDataFoundException.class,()->{
					  objectService.getDistributorDetails(6);
	              }	  
		  );
		  assertEquals("Not Valid Id",exception.getMessage());
	}
	  
	@Test
	public void testgetId()
	{
		 ArrayList<Integer>list= objectService.getId();
		 assertArrayEquals(ArrayList,list.toArray());  
	}
}