package com.loansystem;

public class Loan {
	//data members
	private double principal;
	private double interestrate;
	private int tenure;//years
	
	//constructor
	public Loan(double principal, double interestrate, int tenure) {
		super();
		this.principal = principal;
		this.interestrate = interestrate;
		this.tenure = tenure;
	}

	//to calculate interest
	public double calculateinterest() {
		return principal* interestrate* tenure/100;
	}
	
	public void displayloandetails() {
		System.out.println("Principal :"+principal);
		System.out.println("Interest Rate :"+interestrate+"%");
		System.out.println("Tenure :"+tenure);
		System.out.println("Total Interest :"+calculateinterest());

	}
	
	
	
	
	

}
