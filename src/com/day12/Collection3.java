package com.day12;

import java.util.Stack;

public class Collection3 {

	public static void main(String[] args) {
		Stack st=new Stack<>();
	
		
		st.push(10);
		st.push(20);
		st.push(30);//top of stack
		System.out.println(st);
		//peek->return top  of stack element .
		System.out.println(st.peek());//30
		st.pop();//remove the element from the top of stack
		System.out.println(st);
		
	}

}
