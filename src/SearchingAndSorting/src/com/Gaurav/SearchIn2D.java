package com.Gaurav;

import java.util.Arrays;

public class SearchIn2D {

	public static void main(String[] args) {
		int [][] arr = {
				
				{2,35,6},
				{21,45,98,34},
				{-1,0,-43},
				{2}  
		};
	 int target =1000;
	int [] result =search2D(arr,target);
	System.out.println(Arrays.toString(result));
	}

	static int[] search2D(int[][] arr , int target) {
		if(arr.length==0)
			return new int[] {-1,-1};
		for(int row=0 ; row < arr.length ;row++ ) {
			for( int col=0 ; col < arr[row].length ; col ++) {
				if ( arr[row] [col] == target)
					return new int[] {row, col};
			}
		}
		return new int[] {-1, -1};
	}
	
}
