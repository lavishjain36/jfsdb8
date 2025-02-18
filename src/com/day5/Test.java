package com.day5;

import java.util.Arrays;

public class Test
{
    public static void main (String[] args) 
    {
//        int arr1[] = {1, 2, 3};//Object reference->different
//        int arr2[] = {1, 2, 3};//Object reference->different
//        //checking references equality ,not the content
//        if (arr1.equals(arr2))
//            System.out.println("Same");
//        else
//            System.out.println("Not same");
//        
//        //check elements->not the reference
//        System.out.println(Arrays.equals(arr1, arr2));
    	
    	int[][] arr1= {{1,2},{3,4}};
    	int[][] arr2= {{1,2},{3,4}};
    	
    	System.out.println(Arrays.deepEquals(arr1, arr2));

    	
    }
}