package com.day9.overloading;

//overloading-1 class is sufficient
public class Paymentprocess {

	//method -to implement process using credit card
	public void processPayment(String cardnumber,String expirydate,double amount) {
		System.out.println("Processing  credit card payment of Rs: "+amount+"with card number:"+cardnumber);
	}
	//Overloaded method -to implement process using paypal card-overloaded method
	public void processPayment(String email, double amount) {
		System.out.println("Processing paypal payment of Rs "+amount +" with email :"+email);
		
	}
	//overloaded method -to implement process using bank transfer card
	public void processPayment(String bankname, int accountno, double amount) {
		System.out.println("Processing Bank  payment of Rs "+amount +" with Bankname "+bankname+" account no :"+accountno);

	}
	

	public static void main(String[] args) {
		Paymentprocess p1=new Paymentprocess();
		p1.processPayment("12345678919336","12/29",100000.00);
		p1.processPayment("lavish@gmail.com",100000.00);
		p1.processPayment("SBI Bank",947463663, 10000.00);
	}
	

}
