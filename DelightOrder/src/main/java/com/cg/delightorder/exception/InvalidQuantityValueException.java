package com.cg.delightorder.exception;

@SuppressWarnings("serial")
public class InvalidQuantityValueException extends Exception 
{
	public InvalidQuantityValueException(String string)
	{
		super(string);
	}
}
