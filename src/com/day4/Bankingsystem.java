package com.day4;

import java.util.Scanner;

public class Bankingsystem {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		
		//amount
		double amount=5000.00;

		while(true) {
			System.out.println("\n. Welcome to HDFSC Bank...");
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit Money");
			System.out.println("3.Withdraw Money");
			System.out.println("4.Exit");
			
			System.out.print("Enter choice from 1 to 4");
			

			int choice=sc.nextInt();//to provide choice.//3
			
			switch(choice) {
			
			case 1:
				System.out.println("Your current balance is "+amount);
				break;
			
			case 2:
				System.out.println("Enter the amount to deposit: ");
				double deposit=sc.nextDouble();//2000;
				
				if(deposit>0) {
					amount=amount+deposit;//7000
					System.out.println("Amount deposited successfully.");
					System.out.println("Updated amount "+amount);
				}else {
					System.out.println("Invalid input.");
				}	
				
				break;
				
				
			case 3:
				System.out.println("Enter withdrawal amount :");
				
				double withdraw=sc.nextDouble();//0
				
				//logic T&&T=true
				if(withdraw>0 && withdraw<=amount) {
					amount-=withdraw;//shorthand assignment operator.
					System.out.println("Amount Withdraw successfull.");
					System.out.println("Remaining Balance "+amount);
				}else {
					System.out.println("Insufficient funds available in your account.");
				}
				break;
				
			
			case 4:
				System.out.println("Thank you for banking with us.Have a good day!");
				System.exit(0);//come out of entire execution-JVM
			
			default:
				System.out.println("Invalid choice.Please select a valid option..");
			}
			
		}
		
		
	}

}
