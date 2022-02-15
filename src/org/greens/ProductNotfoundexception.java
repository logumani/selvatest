package org.greens;

public class ProductNotfoundexception extends Exception {
 @Override
	public String getMessage() {
	 String msg= "product you search is not found";
 
	return msg;
 }

}