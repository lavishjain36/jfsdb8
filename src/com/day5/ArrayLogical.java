package com.day5;

public class ArrayLogical {

	public static void main(String[] args) {
		
		int[] numbers= {20,10,80,67,20};//add up and perform sum
		
		//logic to do addition of array numbers
		int sum=0;
		for(int num:numbers) {
			sum=sum+num;//150
		}
//		System.out.println(sum);

		
		//find out the maximum element
		//assume->first element in array is max
		int max=numbers[0];//10
		int size=numbers.length;
		for(int i=1;i<size;i++) {
			//condition
			if(numbers[i]>max)  {
				//50>30
				max=numbers[i];//50 //update the max value
			}
		}
		
		System.out.println("Maximum Element in array "+max);
		

	}

}
