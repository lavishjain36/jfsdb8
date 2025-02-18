package com.day16.varlambdandstreams;

public class Employee {
	 String name;
	 double salary;
	//constructor
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
		
	//tostring
	@Override
	public String toString() {
		return "High Earner: [name=" + name + ", salary=" + salary + "]\n";
	}
	
	 

}
