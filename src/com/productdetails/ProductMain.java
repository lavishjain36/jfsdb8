package com.productdetails;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//create an array of class Product
		Product[] products=new Product[5];//allocate memory of 5 
		
		//take input from user 
		for(int i=0;i<5;i++) {
			System.out.println("Enter the product : "+(i+1));
			System.out.println("Product ID: ");
			int pid=sc.nextInt();
			System.out.println("Product Price: ");
			double price=sc.nextDouble();
			System.out.println("Product Quantity: ");
			int quantity=sc.nextInt();
			
			products[i]=new Product(pid, price, quantity);
		}
		
		
		//calculate highest
		
	}

}
