package com.day5;

public class DemoArray {

	public static void main(String[] args) {
		//declare an array of type of integer
		int[] array;//stack memory
		
		//size of 5 to store elements in memory
		array=new int[5];//allocate a memory to store 5 elements
		
		//index=store the elements
		array[0]=8;
		array[1]=10;
		array[2]=15;
		array[3]=20;
		array[4]=50;
		
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
//		System.out.println(array[3]);
//		System.out.println(array[4]);
		
		//Looping mechanism-Normal for loop
//		for(int i=0;i<array.length;i++) {
//			System.out.print(array[i]+" ");
//		}
		
//		foreach loop  for vs foreach in java?
		for(int value:array) {
			System.out.print(value+" ");
		}
		
	}

}
