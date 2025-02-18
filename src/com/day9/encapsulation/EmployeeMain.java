package com.day9.encapsulation;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp=new Employee("Swapnil", 21, 30000.00);
//		emp.getempdata();
		
		//breaking security->check 
//		emp.setSalary(-2000);
//		emp.setSalary(50000.00);
//		System.out.println(emp.getSalary());
		emp.salary=70000;
	}

}
