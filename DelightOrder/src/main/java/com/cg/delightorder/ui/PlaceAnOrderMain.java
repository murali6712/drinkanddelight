package com.cg.delightorder.ui;

import java.util.Scanner;

import com.cg.delightorder.dao.UpdateAnOrderDao;
import com.cg.delightorder.exception.ProductOrderIdException;
//import com.cg.delightorder.dto.PlaceAnOrder;
import com.cg.delightorder.service.PlaceAnOrderService;
import com.cg.delightorder.util.PlaceAnOrderRepository;
import com.cg.delightorder.util.ProductStockRepository;

public class PlaceAnOrderMain {

	public static void main(String[] args) throws ProductOrderIdException {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter 1 for Place An Order");
			System.out.println("Enter 2 for Display Product Order");
			System.out.println("Enter 3 for Update An Order");
			System.out.println("Enter 4 for Display Distributor Details");
			int userPrefer = scanner.nextInt();
			switch(userPrefer)
			{
				case 1:
				{
					ProductStockRepository orderRepository = new ProductStockRepository();
					orderRepository.setProductData();
					orderRepository.getProductData();
		
					PlaceAnOrderService paoservice = new PlaceAnOrderService();
					//PlaceAnOrder paodto = new PlaceAnOrder();
		
					@SuppressWarnings("resource")
					Scanner scan = new Scanner(System.in);
					
					System.out.println("Enter the Key Id Which you want");
					int id = scan.nextInt();
		
					System.out.println("Enter Product Name");
					String productName = scan.next();
		
					System.out.println("Enter Distributor Id");
					String distributorId = scan.next();
		
					System.out.println("Enter Warehouse Id");
					String warehouseId = scan.next();
		
					System.out.println("Enter Quantity value");
					double quantityValue = scan.nextDouble();
		
					System.out.println("Enter Quantity Unit");
					String quantityUnit = scan.next();
		
					System.out.println("Enter Price Per Unit");
					double pricePerUnit = scan.nextDouble();
		
					StringBuffer productOrderIdBuffer = new StringBuffer();
					productOrderIdBuffer.append("PId");
					productOrderIdBuffer.append(productName);
					String productOrderId = new String(productOrderIdBuffer);
					
					
					if (paoservice.addProductOrder(id, productName, distributorId, warehouseId, quantityValue, quantityUnit, pricePerUnit, 
							productOrderId))
					{
						System.out.println("Product Order Placed Successfully \n");
					}
					else
					{
						System.out.println("Error occurred while Placing Product Order!!!!!");
					}
					continue;
				}
				case 2:
				{
					PlaceAnOrderRepository placeRepository = new PlaceAnOrderRepository();
					placeRepository.displayList();
					continue;
				}
				case 3:
				{
					System.out.println("Enter Product Order Id");
					Scanner sc = new Scanner(System.in);
					String inputId = sc.next();
					UpdateAnOrderDao update = new UpdateAnOrderDao();
					update.doesProductOrderIdExist(inputId);
					System.out.println();
					sc.close();
					break;
				}
				default:
				{
					System.out.println("Enter the Valid Choice!!!");
					continue;
				}
			}
			break;
		}
		
		scanner.close();
	}
}
