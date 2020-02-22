package com.cg.delightorder.service;

import java.util.ArrayList;
import java.util.Map;

import com.cg.delightorder.dao.ProductOrderDetails;
import com.cg.delightorder.dao.ProductPlaceAnOrderDao;
import com.cg.delightorder.dto.PlaceAnOrder;
import com.cg.delightorder.exception.InvalidDistributorIdException;
import com.cg.delightorder.exception.InvalidPricePerUnitException;
import com.cg.delightorder.exception.InvalidProductNameException;
import com.cg.delightorder.exception.InvalidQuantityUnitException;
import com.cg.delightorder.exception.InvalidQuantityValueException;
import com.cg.delightorder.exception.InvalidWarehouseIdException;

public class PlaceAnOrderService implements ProductOrderService
{
	ProductPlaceAnOrderDao placeOrder = new ProductPlaceAnOrderDao();
	ProductOrderDetails orderObject = new ProductOrderDetails();
	
	Map<Integer, PlaceAnOrder> orderMap;
	
	public PlaceAnOrderService()
	{
		orderMap = placeOrder.getOrderData();
	}
	
	ArrayList<String> productName = new ArrayList<>();
	ArrayList<String> distributorId = new ArrayList<>(); 
	ArrayList<String> warehouseId = new ArrayList<>();
	ArrayList<Double> quantityValue = new ArrayList<>();
	ArrayList<String> quantityUnit = new ArrayList<>();
	ArrayList<Double> pricePerUnit = new ArrayList<>();
	boolean flag = true;
	
	public void getOrderList()
	{
		for(Map.Entry<Integer,PlaceAnOrder> map : orderMap.entrySet())
		{
			productName.add(map.getValue().getProductName());
			distributorId.add(map.getValue().getDistributorId());
			warehouseId.add(map.getValue().getWarehouseId());
			quantityValue.add(map.getValue().getQuantityValue());
			quantityUnit.add(map.getValue().getQuantityUnit());
			pricePerUnit.add(map.getValue().getPricePerUnit());
		}
	}
	
	String name;
	String distributor;
	String warehouse;
	double value;
	String unit;
	double price;
	String orderid;
	
	public boolean productNameValidation(int key, String name) throws InvalidProductNameException
	{
		if(!productName.get(key).equals(name))
		{
			this.name = name;
			return true;
			
		}
		else
		{
			throw new InvalidProductNameException("Invalid Name");
		}
	}
	
	public boolean distributorIdValidation ( int key, String distributor) throws InvalidDistributorIdException
	{
		if (!distributorId.get(key).equals(distributor))
		{
			this.distributor = distributor;
			return true;
		}
		else
		{
			throw new InvalidDistributorIdException("Invalid Distributor Id"); 
			
		}
	}
	
	public boolean wareHouseIdValidation ( int key, String warehouse) throws InvalidWarehouseIdException
	{
		if (!warehouseId.get(key).equals(warehouse))
		{
			this.warehouse = warehouse;
			return true;
		}
		else
		{
			throw new InvalidWarehouseIdException("Invalid Warehouse Id");
		}
	}
	
	public boolean quantityValueValidation ( int key, double value) throws InvalidQuantityValueException
	{
		if (value > quantityValue.get(key))
		{
			this.value = value;
			return true;
		}
		else
		{
			throw new InvalidQuantityValueException("Invalid Quantity Value");
		}
	}
	
	public boolean quantityUnitValidation ( int key, String unit) throws InvalidQuantityUnitException
	{
		if (!quantityUnit.get(key).equals(unit))
		{
			this.unit = unit;
			return true;
		}
		else
		{
			throw new InvalidQuantityUnitException("Invalid Quantity Unit");
		}
	}

	public boolean pricePerUnitValidation ( int key, double price) throws InvalidPricePerUnitException
	{
		if (!pricePerUnit.get(key).equals(price))
		{
			this.price = price;
			return true;
		}
		else
		{
			throw new InvalidPricePerUnitException("Invalid Price Per Unit");
		}
	}
	
	public boolean productOrderId(String name, String orderid) 
	{
		if(productName.equals(name))
		{
			this.orderid = orderid;
			
		}
		return true;
	}
	
	public boolean serviceClassValidation(PlaceAnOrder bean)
	{
		orderObject.addOrderDao(bean);
		return flag;
	}

 
}

