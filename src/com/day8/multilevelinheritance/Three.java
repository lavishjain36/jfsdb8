package com.day8.multilevelinheritance;

//Multilevel inheritance

public class Three extends Two {
	
	public void getthird() {
		System.out.println("This is 3rd class method");
	}


	public static void main(String[] args) {
		
		Three obj=new Three();
//		obj.getOne();
		Three.getOne();
		obj.gettwo();
		obj.getthird();

	}

}
//The static method getOne() from the type One should be accessed in a static way->
//you should access them through class name

