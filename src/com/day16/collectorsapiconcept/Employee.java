package com.day16.collectorsapiconcept;

public class Employee {
	
	 String name;
	 String dept;
	 int salary;
	
	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

		
	//getter method->to read the name

	public String getName() {
		return name;
	}



//to set the name
	public void setName(String name) {
		this.name = name;
	}




	public String getDept() {
		return dept;
	}




	public void setDept(String dept) {
		this.dept = dept;
	}




	public int getSalary() {
		return salary;
	}




	public void setSalary(int salary) {
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "name=" + name + ", dept=" + dept + ", salary=" + salary + " ";
	}
	
	
	
	
	

}
