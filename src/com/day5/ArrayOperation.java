package com.day5;

import java.util.Arrays;

public class ArrayOperation {

	public static void main(String[] args) {
		int[] arr= {5,8,2,9,1,4};//unsorted order.
		
		Arrays.sort(arr);//sort the elements of the array
		
		System.out.println(Arrays.toString(arr));
		
	}

}
