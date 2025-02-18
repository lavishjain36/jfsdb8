package com.day5;

public class MultiDimension {

	public static void main(String[] args) {
	//declaration and initialization of 2-D array- 3*3-matrix
		//3*3
		int[][] matrix= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		//minimum-2 loops required if 2-D or M-D
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		//Add number of the given matrix
		int sum=0;
		//iterate through rows and columns
		for(int[] row:matrix) {
			for(int num:row) {
				sum=sum+num;//6+4+5+6
			}
		}
		System.out.println(sum);

	}

}
