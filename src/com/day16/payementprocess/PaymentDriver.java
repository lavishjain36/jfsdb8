package com.day16.payementprocess;

public class PaymentDriver {

	public static void main(String[] args) {
		//object of blinkit store
		BlinkitStore blinkitStore=new BlinkitStore();
		
//		blinkitStore.getcreditcardpayment("64663466446364", 8000.00);
//		blinkitStore.getcreditcardpayment("", 1000.00);
		
//		blinkitStore.getupipayment("lavishoksbi@", 3500.00);
		blinkitStore.getupipayment(null, 3900.00);



	}

}
