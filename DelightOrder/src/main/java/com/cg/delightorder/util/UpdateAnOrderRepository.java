package com.cg.delightorder.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.delightorder.dto.PlaceAnOrder;

public class UpdateAnOrderRepository 
{
	Map<String, PlaceAnOrder> updateOrder = new HashMap<String, PlaceAnOrder>();

	public Map<String, PlaceAnOrder> getUpdateOrder() {
		return updateOrder;
	}

	public void setUpdateOrder(Map<String, PlaceAnOrder> updateOrder) {
		this.updateOrder = updateOrder;
	}
}
