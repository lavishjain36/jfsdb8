package com.day16.payementprocess;

public interface PaymentProcessor {
	//credit card
	
	default void getcreditcardpayment(String cardno,double amount) {
		if(validatepaymentdetail(cardno)) {
			System.out.println("Processed an amount of "+amount);
		}else {
			System.out.println("Invalid card details...");
		}
	}
	
	//UPI payment
	default void getupipayment(String upiid,double amount) {
		if(validatepaymentdetail(upiid)) {
			System.out.println("Processed UPI amount of "+amount);
		}else {
			System.out.println("Invalid UPI details...");
		}
	}
	
	//private method->validation

	private boolean validatepaymentdetail(String paymentinfo) {
		return paymentinfo!=null && !paymentinfo.isEmpty();
		
	}
	
//	void debit();
	
}
