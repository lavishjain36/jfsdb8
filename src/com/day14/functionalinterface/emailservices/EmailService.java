package com.day14.functionalinterface.emailservices;

@FunctionalInterface
public interface EmailService {
	//send email
	void sendemail(String receipient,String msg);
}
