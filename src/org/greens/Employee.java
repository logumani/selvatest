package org.greens;

import java.io.IOException;

public class Employee {
public static void main(String[] args)throws IOException,ProductNotfoundexception {
	String product = "iphone11";
	if(product.equals("iphone10"))
	{
		System.out.println("productfound");
	}
	else {
		throw new ProductNotfoundexception();
	}
}

}

