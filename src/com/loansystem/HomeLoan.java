package com.loansystem;

public class HomeLoan extends Loan {
	
	private String propertyaddresss;

	public HomeLoan(double principal, double interestrate, int tenure, String propertyaddresss) {
		super(principal, interestrate, tenure);//call super class constructor
		this.propertyaddresss = propertyaddresss;
	}
	
	public void displaypropdetails() {
		System.out.println("Property Address :"+ propertyaddresss);
	}
	
	

}
