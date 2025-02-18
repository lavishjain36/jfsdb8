package com.day16.collectorsapiconcept;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDriver {

	public static void main(String[] args) {
		List<Employee> emps=Arrays.asList(
				new Employee("sujay", "HR", 45000),
				new Employee("manjay", "Dev", 65000),
				new Employee("sanjay", "IT", 35000),
				new Employee("manthan", "Dev", 75000),
				new Employee("Kunjay", "HR", 85000)
				);
		
		
		//group the data based on dept.
		Map<String, List<Employee>> grpbydept=emps.stream().
				collect(Collectors.groupingBy(Employee::getDept));
		
//		System.out.println(grpbydept);
		
		
		//partion the data. based salary >=45000
		
		Map<Boolean, List<Employee>> partbysalary=emps.stream().
				collect(Collectors.partitioningBy(e->e.getSalary()>=75000));
//		System.out.println(partbysalary);
				
		
		//Collect data list,as set or map
		List<String> names=emps.stream()
				.map(Employee::getName)
				.collect(Collectors.toList());
		
		System.out.println(names);
		
	//joining
		String names1=emps.stream()
				.map(Employee::getName)
				.collect(Collectors.joining("\n"));
		
		System.out.println(names1);
		
		//count of employees
		long count=emps.stream().collect(Collectors.counting());
		System.out.println(count);
		
		//Immutable collections->Immutable Collection
//	List<String> unmod=emps.stream().map(Employee::getName).collect(Collectors.toUnmodifiableList());
//	System.out.println(unmod);
		
	//Immutable collection in java -Collectors API	
	var salary=emps.stream().
			   collect(Collectors.toUnmodifiableMap(emp->emp.name,emp->emp.salary));
	System.out.println(salary);
	
	salary.put("manjay", 87000);
	}

}
