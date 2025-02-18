package com.loansystem;

public class BankLoanDriver {

	public static void main(String[] args) {
		//create an object of homeloan class
		HomeLoan homeLoan=new HomeLoan(8000000, 8.5, 8, "Gk Silverland residency,Pune");
		homeLoan.displayloandetails();
		homeLoan.displaypropdetails();
	}

}
