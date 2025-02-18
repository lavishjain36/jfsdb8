package com.day9.encapsulation;

public class Employee {
	//Data hide->
	private String name;
	private int age;
	private double salary;
	//constructor
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	//getter->reading
	public String getName() {
		return name;
	}
	//modification-of name
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>18) {
			this.age=age;
			
		}else {
			System.out.println("Invalid age....");
		}
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>0) {
			this.salary=salary;
		}else {
			System.out.println("Salary must be positive");
		}
	}
	
	//getter and setter
	
	//method
	public void getempdata() {
		System.out.println("Employee Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
	}

	
}
