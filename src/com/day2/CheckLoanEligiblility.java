package com.day2;

public class CheckLoanEligiblility {

	public static void main(String[] args) {
		int age=15;
		double montlyincome=180000;
		
		if(age>=18) {
			if(montlyincome>=20000) {
				System.out.println("Eligible for loan");
			}else {
				System.out.println("Not eligibe for the loan. Your monthly income is too low.");
			}
		}else {
			System.out.println("Not eligible for loan.Must be 18 or equal.");
		}

	}

}
