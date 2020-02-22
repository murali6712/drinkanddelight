package com.cg.delightorder.dto;

public class DistributorDetails 
{
	private int distributorId;
	private String distributorName;
	private String address;
	private long phoneNumber;
	
	
	public DistributorDetails(int distributorId, String distributorName, String address, long phoneNumber) {
		super();
		this.distributorId = distributorId;
		this.distributorName = distributorName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	
	public int getDistributorId() {
		return distributorId;
	}


	public void setDistributorId(int distributorId) {
		this.distributorId = distributorId;
	}


	public String getDistributorName() {
		return distributorName;
	}


	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
