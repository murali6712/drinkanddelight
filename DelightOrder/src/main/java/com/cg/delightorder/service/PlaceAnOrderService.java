package com.cg.delightorder.service;

import com.cg.delightorder.dao.ProductPlaceAnOrderDao;
import com.cg.delightorder.dto.PlaceAnOrder;
import com.cg.delightorder.exception.InvalidDistributorIdException;
import com.cg.delightorder.exception.InvalidPricePerUnitException;
import com.cg.delightorder.exception.InvalidProductNameException;
import com.cg.delightorder.exception.InvalidQuantityUnitException;
import com.cg.delightorder.exception.InvalidQuantityValueException;
import com.cg.delightorder.exception.InvalidWarehouseIdException;
import com.cg.delightorder.util.ProductStockRepository;

public class PlaceAnOrderService implements ProductOrderService
{
	ProductPlaceAnOrderDao placeOrder = new ProductPlaceAnOrderDao();
	PlaceAnOrder paodto = new PlaceAnOrder();

	public boolean addProductOrder(int id, String productName, String distributorId, String warehouseId, double quantityValue,
			String quantityUnit, double pricePerUnit, String productOrderId)
	{
		ProductStockRepository stockRepository = new ProductStockRepository();
		stockRepository.setProductData();
		
		//ProductNameValidation
		try
		{
			if (stockRepository.getStock().get(id).getProductName().equals(productName))
			{
				paodto.setProductName(productName);
			}
			else
			{
				throw new InvalidProductNameException("Invalid Name");
			}
		}
		catch (InvalidProductNameException e)
		{
			e.printStackTrace();
		}
		
		//DistributorIdValidation
		try
		{
			if (stockRepository.getStock().get(id).getDistributorId().equals(distributorId))
			{
				paodto.setDistributorId(distributorId);
			}
			else
			{
				throw new InvalidDistributorIdException("Invalid Distributor Id");
			}
		}
		catch (InvalidDistributorIdException e)
		{
			e.printStackTrace();
		}
		
		//WarehouseIdValidation
		try
		{
			if (stockRepository.getStock().get(id).getWarehouseId().equals(warehouseId))
			{
				paodto.setWarehouseId(warehouseId);
			}
			else
			{
				throw new InvalidWarehouseIdException("Invalid Warehouse Id");
			}
		}
		catch (InvalidWarehouseIdException e)
		{
			e.printStackTrace();
		}
		
		//QuantityValueValidation
		try
		{
			if (stockRepository.getStock().get(id).getQuantityValue() >= quantityValue)
			{
				paodto.setQuantityValue(quantityValue);
			}
			else
			{
				throw new InvalidQuantityValueException("Invalid Quantity Value");
			}
		}
		catch (InvalidQuantityValueException e)
		{
			e.printStackTrace();
		}
		
		//QuantityUnitValidation
		try
		{
			if (stockRepository.getStock().get(id).getQuantityUnit().equals(quantityUnit))
			{
				paodto.setQuantityUnit(quantityUnit);
			}
			else
			{
				throw new InvalidQuantityUnitException("Invalid Quantity Unit");
			}
		}
		catch (InvalidQuantityUnitException e)
		{
			e.printStackTrace();
		}
		
		//PricePerUnitValidation
		try
		{
			if (stockRepository.getStock().get(id).getPricePerUnit() == pricePerUnit)
			{
				paodto.setPricePerUnit(pricePerUnit);
			}
			else
			{
				throw new InvalidPricePerUnitException("Invalid Price Per Unit");
			}
		}
		catch (InvalidPricePerUnitException e)
		{
			e.printStackTrace();
		}
		
		paodto.setProductOrderId(productOrderId);
		
		if (paodto.getProductName() == null || paodto.getDistributorId() == null || paodto.getWarehouseId() == null || 
				paodto.getQuantityValue() == 0 || paodto.getQuantityUnit() == null || paodto.getPricePerUnit() == 0)
		{
			return false;
		}
		else
		{
			return placeOrder.addPlaceOrder(paodto);
		}
	}
	
}
