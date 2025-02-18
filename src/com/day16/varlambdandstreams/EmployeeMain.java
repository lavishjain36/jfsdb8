package com.day16.varlambdandstreams;

import java.util.List;
import java.util.stream.Collectors;

//var ->pipeline streams of the data in flexible way.
//lambda expression->int ,float,string
//we can functional programming approach.
public class EmployeeMain {

	public static void main(String[] args) {
		//list of employee user->name,salary
		var employees=List.of(
				new Employee("Lavish", 10000.00),
				new Employee("Kushal", 8000.00),
				new Employee("Pavan", 5000.00),
				new Employee("Sanjay", 80000.00)
		);
		
//		System.out.println(employees);
				
	var maxsalar=employees.stream()
		 .filter((var emp)-> emp.salary>8000)
		 .collect(Collectors.toList());

	System.out.println(maxsalar);
	
	int rating=4;
//	switch expression-get the value->5->20%,4->15%,3->8%,2 or 1->5
	
	//Switch labelled->12 finalized-14 version java->
//	break keyword-removed
	
	var hikepercentage=switch (rating) {
	case 5 ->20;
	case 4->15;
	case 3->10;
	case 2,1->5;
	default ->throw new IllegalArgumentException("Invalid Rating : " + rating+"Hello");
	};
	
	System.out.println(hikepercentage+"%");
	
	//javascript Object notation->key value pair
//	textblock->15-removes approach +,"",
//	textblock->json restful apis
	var empobj="""
			{
			"name":"Lavish",
			"designation":"Sr.Corporate Technology Mentor developer",
			}
			""";
	}

}
