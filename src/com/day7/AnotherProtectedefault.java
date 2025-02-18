package com.day7;

import com.day8.Protectedmodifier;

//inheritance->
//protected->this data coming from outside of package from other class
public class AnotherProtectedefault  extends Protectedmodifier{

	public static void main(String[] args) {
		AnotherProtectedefault obj=new AnotherProtectedefault();//child
		obj.getinfo();
	}

}
