package com.day2;

public class Realiancegrocery {

	public static void main(String[] args) {
		//total bill-1200 rs
		double totalbill=5200;
		
		double discount;
		
		//business logic
		if(totalbill>2000) {
			discount=20;//20% discount
		}else if(totalbill>1000) {
			discount=15;//15%
		}else if(totalbill>500) {
			discount=10;//10% 
		}else {
			discount=5;//discount of 5%
		}
		
		System.out.println("Total bill generated: "+totalbill);
		System.out.println("Discount applied "+discount+"%");
		System.out.println("Amount to be paid: "+(totalbill-(totalbill*discount)/100));
	}

}
