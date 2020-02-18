package com.cg.delightorder.dto;

import java.util.Date;

public class PlaceAnOrder 
{
	private String productName;
	private String distributorId;
	private String warehouseId;
	private double quantityValue;
	private String quantityUnit;
	private double pricePerUnit;
	
	private String productOrderId;
	
	

	//constructor for adding stock details
	public PlaceAnOrder(String productName, String distributorId, String warehouseId, double quantityValue,
			String quantityUnit, double pricePerUnit) {
		super();
		this.productName = productName;
		this.distributorId = distributorId;
		this.warehouseId = warehouseId;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.pricePerUnit = pricePerUnit;
	}
	
	
	public PlaceAnOrder() 
	{
		
	}
	
	private String orderId;
	private Date dateOfOrder;
	private Date dateOfDelivery;
	private double totalPrice;
	private String deliveryStatus;
	
	//Constructor using above fields
	
	public PlaceAnOrder(String orderId, String name, String distributorId, double quantityValue, 
			String quantityUnit,Date dateOfOrder, Date dateOfDelivery, double pricePerUnit, 
			double totalPrice, String deliveryStatus,String warehouseId) 
	{
		super();
		this.orderId = orderId;
		this.productName = name;
		this.distributorId = distributorId;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.dateOfOrder = dateOfOrder;
		this.dateOfDelivery = dateOfDelivery;
		this.pricePerUnit = pricePerUnit;
		this.totalPrice = totalPrice;
		this.deliveryStatus = deliveryStatus;
		this.warehouseId = warehouseId;
	}
	
	//getters and setters
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String name) {
		this.productName = name;
	}
	public String getDistributorId() {
		return distributorId;
	}
	public void setDistributorId(String supplierId) {
		this.distributorId = supplierId;
	}
	public double getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}
	public String getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public Date getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public Date getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

	
	public String getProductOrderId() {
		return productOrderId;
	}
	public void setProductOrderId(String productOrderId) {
		this.productOrderId = productOrderId;
	}

}
