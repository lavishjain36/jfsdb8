package com.day5;

import java.util.Arrays;

public class ArrayInsertion {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int data=25,index=2;
		
		//Method->
		arr=insertElement(arr,data,index);
		System.out.println(Arrays.toString(arr));
	
	}

	//method
	private static int[] insertElement(int[] arr, int data, int index) {
		//to handle exception
		if(index<0 || index>arr.length) {
			throw new IndexOutOfBoundsException("Invalid Index");
		}
		int[] newarr=new int[arr.length+1];//size of 5	
		for(int i=0,j=0;i<newarr.length;i++) {
			if(i==index) {
				//insert-25 element at that index position
				newarr[i]=data;//we are inserting 25 only
			}else {
				newarr[i]=arr[j++];//copy and shifting the element from old array to new array
			}
		}
		
		return newarr;
	}

}
