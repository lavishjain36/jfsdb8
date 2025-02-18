package com.day8;

//inheritance approach
public class Child extends Parent {
	
	public void getdatachild() {
		System.out.println("This is a child class");
	}

	public static void main(String[] args) {
		//create an object of parent class
		Parent parent=new Parent();//deafult constructor
		
		//create an object of child class
		Child child=new Child();//default constructor
		
		parent.getdataparent();
		
		//child have capability to call all the methods in available parent and child class
		child.getdataparent();
		child.getdatachild();

	}

}
