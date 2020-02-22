package com.cg.delightorder.service;

import com.cg.delightorder.dto.PlaceAnOrder;
import com.cg.delightorder.exception.InvalidDistributorIdException;
import com.cg.delightorder.exception.InvalidPricePerUnitException;
import com.cg.delightorder.exception.InvalidProductNameException;
import com.cg.delightorder.exception.InvalidQuantityUnitException;
import com.cg.delightorder.exception.InvalidQuantityValueException;
import com.cg.delightorder.exception.InvalidWarehouseIdException;
import com.cg.delightorder.exception.ProductOrderIdException;

public interface ProductOrderService 
{
	public void getOrderList();
	public boolean productNameValidation(int key, String name) throws InvalidProductNameException;
	public boolean distributorIdValidation (int key, String distributor) throws InvalidDistributorIdException;
	public boolean wareHouseIdValidation (int key, String warehouse) throws InvalidWarehouseIdException;
	public boolean quantityValueValidation (int key, double value) throws InvalidQuantityValueException;
	public boolean quantityUnitValidation (int key, String unit) throws InvalidQuantityUnitException;
	public boolean pricePerUnitValidation (int key, double price) throws InvalidPricePerUnitException;
	public boolean productOrderId(String name, String orderid) throws ProductOrderIdException;
	public boolean serviceClassValidation(PlaceAnOrder bean);
}


