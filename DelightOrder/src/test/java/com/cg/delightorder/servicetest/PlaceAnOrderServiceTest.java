package com.cg.delightorder.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.delightorder.exception.InvalidDistributorIdException;
import com.cg.delightorder.exception.InvalidPricePerUnitException;
import com.cg.delightorder.exception.InvalidProductNameException;
import com.cg.delightorder.exception.InvalidQuantityUnitException;
import com.cg.delightorder.exception.InvalidQuantityValueException;
import com.cg.delightorder.exception.InvalidWarehouseIdException;
import com.cg.delightorder.service.PlaceAnOrderService;

public class PlaceAnOrderServiceTest {
	
	PlaceAnOrderService object = new PlaceAnOrderService();
	
	@BeforeEach
	public void detailsListTest()
	{
		object.getOrderList();
	}
	
	
	
	@Test
	public void productNameTest1() throws InvalidProductNameException
	{
	assertTrue(object.productNameValidation(1, "Apple"));
	}
	
	
	
	@Test
	public void distributorIdTest()  
	{
		Throwable exception = assertThrows(InvalidDistributorIdException.class, ()->{
			object.distributorIdValidation(0, "ABC6712");
		}	);
		assertEquals("Invalid Distributor Id",exception.getMessage());
	}
	
	
	
	@Test
	public void distributorIdTest1() throws InvalidDistributorIdException
	{
	assertTrue(object.distributorIdValidation(1, "ABC6712"));
	}
	
	
	
	@Test
	public void warehouseIdTest()  
	{
		Throwable exception = assertThrows(InvalidWarehouseIdException.class, ()->{
			object.wareHouseIdValidation(0, "11606712");
		}	);
		assertEquals("Invalid Warehouse Id",exception.getMessage());
	}
	
	
	
	@Test
	public void warehouseIdTest1() throws InvalidWarehouseIdException
	{
	assertTrue(object.wareHouseIdValidation(1, "11606712"));
	}
	
	
	
	@Test
	public void quantityValueTest()  
	{
		Throwable exception = assertThrows(InvalidQuantityValueException.class, ()->{
			object.quantityValueValidation(0, 50.8);
		}	);
		assertEquals("Invalid Quantity Value",exception.getMessage());
	}
	
	
	@Test
	public void quantityValueTest1() throws InvalidQuantityValueException
	{
	assertTrue(object.quantityValueValidation(1, 99.9));
	}
	
	
	
	@Test
	public void quantityUnitTest1() throws InvalidQuantityUnitException
	{
	assertTrue(object.quantityUnitValidation(1, "10"));
	}
	
	
	
	@Test
	public void pricePerUnitTest() throws InvalidPricePerUnitException
	{
	assertTrue(object.pricePerUnitValidation(1, 15.5));
	}
	
	
	
	@Test
	public void orderIdTest()
	{
	assertTrue(object.productOrderId("Apple", "productApple13"));
	}
	
}
