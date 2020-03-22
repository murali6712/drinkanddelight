package com.cg.delightorder.exception;

@SuppressWarnings("serial")
public class InvalidProductNameException extends Exception 
{
	public InvalidProductNameException(String string)
	{
		super(string);
	}
}