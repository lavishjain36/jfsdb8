package com.day4;

public class WhileDemo {

	public static void main(String[] args) {
		int i=50;
		int N=49;
		//print number from 1 to 5  1<=5 ,2<=5,3<=5,4<=5,5<=5,6<=5(out of while loop)
		while(i<=N) {
			//body of the while loop
			System.out.print(i+" ");//1 2 3 4 5
			i++;//6
		}
	}

}
