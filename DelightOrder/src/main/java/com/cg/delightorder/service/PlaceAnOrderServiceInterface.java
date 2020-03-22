package com.cg.delightorder.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cg.delightorder.dto.PlaceAnOrder;
import com.cg.delightorder.exception.InvalidDistributorIdException;
import com.cg.delightorder.exception.InvalidIdException;
import com.cg.delightorder.exception.InvalidPricePerUnitException;
import com.cg.delightorder.exception.InvalidProductNameException;
import com.cg.delightorder.exception.InvalidQuantityUnitException;
import com.cg.delightorder.exception.InvalidQuantityValueException;
import com.cg.delightorder.exception.InvalidWarehouseIdException;
import com.cg.delightorder.exception.NoDataFoundException;
import com.cg.delightorder.exception.ProductOrderIdException;

public interface PlaceAnOrderServiceInterface 
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
	
	public List<PlaceAnOrder> getOrderDetailsService();
	
	//public  Map<Integer,PlaceAnOrder> getStockDisplay = new HashMap<Integer, PlaceAnOrder>();

	Map<Integer, PlaceAnOrder> getStockDisplay();
	
	public ArrayList<Integer> getId();
	
	public String getDistributorDetails(Integer orderId) throws NoDataFoundException;
	public boolean idValidation(int id) throws InvalidIdException;
	
}