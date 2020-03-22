package com.cg.delightorder.ui;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
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
import com.cg.delightorder.service.PlaceAnOrderService;
import com.cg.delightorder.service.PlaceAnOrderServiceInterface;


public class PlaceAnOrderClient {

	public static void main(String[] args) throws ProductOrderIdException{
		// TODO Auto-generated method stub
		PlaceAnOrderServiceInterface order = new PlaceAnOrderService();
		order.getOrderList();
		
		PlaceAnOrderServiceInterface stockService = new PlaceAnOrderService();
		
		String name;
		String distributor;
		String warehouse;
		String unit;
		double value;
		double price;
		
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.println("\nEnter 1 for Display Details");
			System.out.println("Enter 2 for Place An Order");
			System.out.println("Enter 3 for Display Product Order");
			System.out.println("Enter 4 for Display Distributor Details");
			int userPrefer = scanner.nextInt();
			switch(userPrefer)
			{
			case 1:
			{
				Map<Integer, PlaceAnOrder> mapOrder = stockService.getStockDisplay();
				for(Map.Entry<Integer,PlaceAnOrder> map : mapOrder.entrySet())
				{
					System.out.println("Input Key:" + map.getKey()+ "Product Name:" + map.getValue().getProductName() + " "+
							"Distributor Id:"+ map.getValue().getDistributorId()+ " "+ "warehouse Id:" + map.getValue().getWarehouseId()+ " "+
							"Quantity Value:"+ map.getValue().getQuantityValue()+ " "+ "Quantity Unit:"+ map.getValue().getQuantityUnit()+ " "+
							"Price Per Unit:"+ map.getValue().getPricePerUnit());
				}
				continue;
			}
			
				
			case 2:
			{
	
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				int id;
				
				while (true)
				{
					System.out.println("Enter the Key Id Which you want");
					id = scan.nextInt();
					try
					{
						if(order.idValidation(id))
							break;
					}
					catch(InvalidIdException exception)
					{
						System.out.println(exception.getMessage()); 
					}
				}
				
				
				while (true)
				{
					System.out.println("Enter Product Name");
					name = scan.next();
					
					try
					{
						if (order.productNameValidation(id, name))
							break;
					}
					catch(InvalidProductNameException exception)
					{
						System.out.println(exception.getMessage());
					}
				}
				
				while (true)
				{
					System.out.println("Enter Distributor Id");
					distributor = scan.next();
					try
					{
						if (order.distributorIdValidation(id, distributor))
							break;
					}
					catch (InvalidDistributorIdException exception)
					{
						System.out.println(exception.getMessage());
					}
				}
				 
				while (true)
				{
					System.out.println("Enter Warehouse Id");
					warehouse = scan.next();
					try
					{
						if (order.wareHouseIdValidation(id, warehouse))
							break;
					}
					catch (InvalidWarehouseIdException exception)
					{
						System.out.println(exception.getMessage());
					}
				}
				
				while (true)
				{
					System.out.println("Enter Quantity value");
					value = scan.nextDouble();
					try
					{
						if (order.quantityValueValidation(id, value))
							break;
					}
					catch(InvalidQuantityValueException exception)
					{
						System.out.println(exception.getMessage());
					}
				}
				
				while (true)
				{
					System.out.println("Enter Quantity Unit");
					unit = scan.next();
					try
					{
						if(order.quantityUnitValidation(id, unit))
							break;
					}
					catch(InvalidQuantityUnitException exception)
					{
						System.out.println(exception.getMessage());
					}
				}
				
				while (true)
				{
					System.out.println("Enter Price Per Unit");
					price = scan.nextDouble();
					try
					{
						if(order.pricePerUnitValidation(id, price))
							break;
					}
					catch(InvalidPricePerUnitException exception)
					{
						System.out.println(exception.getMessage());
					}
				}
				
				while (true)
				{
					StringBuilder string = new StringBuilder();
					string.append("product");
					string.append(name);
					string.append(13);
					String orderId = string.toString();
					if (order.productOrderId(name, orderId))
					{
						break;
					}
				}
				
				PlaceAnOrder beanClass = new PlaceAnOrder();
				beanClass.setProductName(name);
				beanClass.setDistributorId(distributor);
				beanClass.setWarehouseId(warehouse);
				beanClass.setQuantityValue(value);
				beanClass.setQuantityUnit(unit);
				beanClass.setPricePerUnit(price);
				
				if(order.serviceClassValidation(beanClass))
				{
					System.out.println("Product Order Placed Successfully");
				}
				else
				{
					System.out.println("Error Occurred While Placing an Order");
				}
				continue;
				
			}
			
			case 3:
			{
				PlaceAnOrderServiceInterface object = new PlaceAnOrderService();
				List <PlaceAnOrder> detailList = object.getOrderDetailsService();
				
				for (int loop = 0; loop < detailList.size(); loop++)
				{
					System.out.println("ProductName:\t" + detailList.get(loop).getProductName()+ 
							"\nDistributor Id:\t" + detailList.get(0).getDistributorId()+
							"\nWarehouse Id:\t" + detailList.get(loop).getWarehouseId()+ 
							"\nQuantity Value:\t"+detailList.get(loop).getQuantityValue()+
							"\nQuantity Unit:\t"+ detailList.get(loop).getQuantityUnit()+ 
							"\nPricePerUnit:\t" + detailList.get(loop).getPricePerUnit());
				}
				continue;
			}
			
			
			case 4:
			{
				PlaceAnOrderServiceInterface distributorDetailsService = new PlaceAnOrderService();
				Scanner scan = new Scanner(System.in);
				System.out.println("Distributor id");
				System.out.println(distributorDetailsService.getId());
				System.out.println("Enter the Distributor Id which you want");
				int disributorId = scan.nextInt();
				scan.nextLine();
				try {
					try {
						System.out.println(distributorDetailsService.getDistributorDetails(disributorId));
					} catch (NoDataFoundException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
				} catch (NoSuchElementException e) {
					// TODO Auto-generated catch block 
					System.out.println(e.getMessage());
				}
				
				continue;
			}
			default:
			{
				System.out.println("Enter the Valid Choice!!!");
				break;
			}
			}
			scanner.close();
			break;
		}
		
	}
}
