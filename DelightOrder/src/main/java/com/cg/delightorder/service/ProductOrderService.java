package com.cg.delightorder.service;


public interface ProductOrderService 
{
	boolean addProductOrder(int id, String productName, String distributorId, String warehouseId, double quantityValue, 
			String quantityUnit, double pricePerUnit, String productOrderId);
}
