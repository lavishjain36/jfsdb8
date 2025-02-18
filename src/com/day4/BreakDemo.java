package com.day4;

public class BreakDemo {

	
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==5 || i==7) {
				//skip the current iteration and move to next increment
				continue;
			}
			System.out.print(i+" ");
			
		}//end of the for loop

	}

}
