package com.cg.delightorder.exception;

@SuppressWarnings("serial")
public class NoDataFoundException extends Exception 
{
	public NoDataFoundException(String string)
	{
		super("Distributor Id is not Found");
	}
}
