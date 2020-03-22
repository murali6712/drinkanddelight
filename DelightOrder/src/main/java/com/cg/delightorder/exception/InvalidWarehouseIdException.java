package com.cg.delightorder.exception;

@SuppressWarnings("serial")
public class InvalidWarehouseIdException extends Exception 
{
	public InvalidWarehouseIdException(String string)
	{
		super(string);
	}
}