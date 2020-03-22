package com.cg.delightorder.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.delightorder.dto.DistributorDetails;

public class DistributorRepository 
{
	static Map<Integer, DistributorDetails> distributorRepository = new HashMap<Integer, DistributorDetails>();

	

	//public static void setDistributorRepository(Map<Integer, DistributorDetails> distributorRepository)
	static
	{
		distributorRepository.put(1, new DistributorDetails(1, "Harsha_Fruits_Shop", "Hyderabad", 606712));
		distributorRepository.put(2, new DistributorDetails(2, "Vijay_Coke_Services","Vijayawada", 606713));
		distributorRepository.put(3, new DistributorDetails(3, "Sai_Teja_Services", "Vizag", 606714));
		distributorRepository.put(4, new DistributorDetails(4, "Murali_Coke_Services", "Tadepalligudem", 606715));
	}
	
	public static Map<Integer, DistributorDetails> getDistributorRepository() {
		return distributorRepository;
	}
}