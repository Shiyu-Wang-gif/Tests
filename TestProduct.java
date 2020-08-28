package test;

import info.ProductCategory;
import info.ProductDetails;

public class TestProduct {
	// main
	public static void main(String[] args) {
		ProductCategory productCategory1 = new ProductCategory(213, "Shampoo");
		
		ProductDetails product1 = new ProductDetails(21329147, "Dove", productCategory1, 50, 46.2);
		product1.printInfo();
		System.out.println("=================================");
		
		ProductDetails product2 = new ProductDetails(1239410, "Chanel", productCategory1, 0, 262.4);
		product2.printInfo();
	}
	
	// static code block
	static {
		System.out.println("Test the ProductCategory and ProductDetails classes");
		System.out.println("=================================");
	}
}