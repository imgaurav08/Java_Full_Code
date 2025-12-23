package com.Gaurav;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		int [] arr = {2,13,34,55,35,21};
  System.out.println("Before swap" + Arrays.toString(arr));
		swap(arr,3,5);
		System.out.println(Arrays.toString(arr));

	}
 public static void swap(int[]arr , int Index1, int Index2) {
	 int temp= arr[Index1];
	arr [Index1]= arr[Index2];
	 arr[Index2]=temp; 
 }
}
