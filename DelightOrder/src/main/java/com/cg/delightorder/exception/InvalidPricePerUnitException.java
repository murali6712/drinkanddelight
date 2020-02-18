package com.cg.delightorder.exception;

@SuppressWarnings("serial")
public class InvalidPricePerUnitException extends Exception 
{
	public InvalidPricePerUnitException(String string)
	{
		super(string);
	}
}
