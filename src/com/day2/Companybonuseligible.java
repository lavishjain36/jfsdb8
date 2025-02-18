package com.day2;

public class Companybonuseligible {

	public static void main(String[] args) {
		int years_of_service=1;
		double performance_rating=4.5;
		int completed_projects=12;
		boolean has_discplinary_actions=false;
		
		//write logic->short circuit property
		if(years_of_service>=2 && 
		  (performance_rating>=4.0||completed_projects>=10) &&
		  !has_discplinary_actions) {
			System.out.println("Employee is eligible for bonus...");
		}else {
			System.out.println("Not eligible for bonus...");
		}
	}

}
