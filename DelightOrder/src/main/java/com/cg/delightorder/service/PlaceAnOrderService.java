package com.cg.delightorder.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cg.delightorder.dao.DistributorDetailsDao;
import com.cg.delightorder.dao.ProductOrderDetails;
import com.cg.delightorder.dao.ProductPlaceAnOrderDao;
import com.cg.delightorder.dto.PlaceAnOrder;
import com.cg.delightorder.exception.InvalidDistributorIdException;
import com.cg.delightorder.exception.InvalidIdException;
import com.cg.delightorder.exception.InvalidPricePerUnitException;
import com.cg.delightorder.exception.InvalidProductNameException;
import com.cg.delightorder.exception.InvalidQuantityUnitException;
import com.cg.delightorder.exception.InvalidQuantityValueException;
import com.cg.delightorder.exception.InvalidWarehouseIdException;
import com.cg.delightorder.exception.NoDataFoundException;

public class PlaceAnOrderService implements PlaceAnOrderServiceInterface
{
	ProductPlaceAnOrderDao placeOrder = new ProductPlaceAnOrderDao();
	ProductOrderDetails orderObject = new ProductOrderDetails();
	
	DistributorDetailsDao distributorDetailsObject = new DistributorDetailsDao();
	
	ArrayList<Integer> listId = new ArrayList<Integer>();
	
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
		if(orderMap.get(key).getProductName().equals(name))
		{
			
			return true;
			
		}
		else
		{
			throw new InvalidProductNameException("Invalid Product Name");
		}
	}
	
	public boolean distributorIdValidation ( int key, String distributor) throws InvalidDistributorIdException
	{
		if (orderMap.get(key).getDistributorId().equals(distributor))
		{
			
			return true;
		}
		else
		{
			throw new InvalidDistributorIdException("Invalid Distributor Id"); 
			
		}
	}
	
	public boolean wareHouseIdValidation ( int key, String warehouse) throws InvalidWarehouseIdException
	{
		if (orderMap.get(key).getWarehouseId().equals(warehouse))
		{
			
			return true;
		}
		else
		{
			throw new InvalidWarehouseIdException("Invalid Warehouse Id");
		}
	}
	
	public boolean quantityValueValidation ( int key, double value) throws InvalidQuantityValueException
	{
		if (orderMap.get(key).getQuantityValue() > quantityValue.get(key))
		{
			
			return true;
		} 
		else
		{
			throw new InvalidQuantityValueException("Invalid Quantity Value");
		}
	}
	
	public boolean quantityUnitValidation ( int key, String unit) throws InvalidQuantityUnitException
	{
		if (orderMap.get(key).getQuantityUnit().equals(unit))
		{
			
			return true;
		}
		else
		{
			throw new InvalidQuantityUnitException("Invalid Quantity Unit");
		}
	}

	public boolean pricePerUnitValidation ( int key, double price) throws InvalidPricePerUnitException
	{
		if (orderMap.get(key).getPricePerUnit() == price)
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

	
	
	@Override
	public List<PlaceAnOrder> getOrderDetailsService() {
		// TODO Auto-generated method stub
		return orderObject.getOrderDetailsDao();
	}

	@Override
	public Map<Integer, PlaceAnOrder> getStockDisplay() {
		// TODO Auto-generated method stub
		return orderMap;
	}


	@Override
	public ArrayList<Integer> getId() {
		// TODO Auto-generated method stub
		listId = distributorDetailsObject.getIds();
		return listId;
	}

	
	@Override
	public String getDistributorDetails(Integer orderId) throws NoDataFoundException 
	{
		// TODO Auto-generated method stub
		String finalResult = null;
		for(Integer i : listId)
		{
			if(i == orderId)
			{
				finalResult = distributorDetailsObject.getDistributorDetailsDao(orderId);
			}
		}
		if(finalResult == null)
		{
			throw new NoDataFoundException("Not Valid Id");
		}
		else
		{
			return finalResult;
		}
	}

	@Override
	public boolean idValidation(int id) throws InvalidIdException {
		// TODO Auto-generated method stub
		if(orderMap.containsKey(id))
		{
			return true;
		}
		else
		{
			throw new InvalidIdException("InvalidId");
		}
	}

 
}

