package com.day14.functionalinterface.emailservices;

public class EmailDriverMain {

	public static void main(String[] args) {
	//lambda impl.
		EmailService emailService=(receipent,msg)->{
			System.out.println("Sending email to: "+receipent);
			System.out.println("Message:"+msg);
		};
		emailService.sendemail("lavish@gmail.com", "Hi People. Hope your are doing well.");
	}

}
