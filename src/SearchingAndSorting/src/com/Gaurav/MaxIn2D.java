package com.Gaurav;

public class MaxIn2D {

	public static void main(String[] args) {
int [][] arr = {
				
				{2,35,6},
				{21,45,98,34},
				{-1,0,-43},
				{2}  
		};
System.out.println(maximum2D(arr));

	}

	static int maximum2D(int arr[] []) {
		int max = Integer.MIN_VALUE;
		for( int row = 0 ; row < arr.length ; row++) {
			for (int col =0 ; col< arr[row] .length ; col ++) {
				if(arr[row] [col] > max) {
					 max = arr[row] [col];
				}
					
			}
		}
		return max;
	}
	
}
