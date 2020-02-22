package com.cg.delightorder.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.cg.delightorder.dto.PlaceAnOrder;

public class ProductOrderRepository 
{
	PlaceAnOrder object = new PlaceAnOrder();
	public static List<PlaceAnOrder> orderUpdate = new ArrayList<PlaceAnOrder>();
	
	public  List<PlaceAnOrder>  getOrderDetails()
	{
	return orderUpdate;	
	}
	
	public void setOrderDetails(PlaceAnOrder bean)
	{	
		orderUpdate.add(bean);
	}
}
 