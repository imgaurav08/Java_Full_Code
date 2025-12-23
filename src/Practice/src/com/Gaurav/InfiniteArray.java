package com.Gaurav;

public class InfiniteArray {

	public static void main(String[] args) {
		int [] arr = {34,45,57,78,122,125,234,257,345,389,456,459,500,509,600,607,700,854,978,999,1000};
		 int target =45;
		 System.out.println(answer(arr, target));
		}

	

	public static int answer(int [] arr , int target) {
 int start =0;
 int end =1;
 while(target > arr[end]) {
	 int newStart = end+1;
	 end = end +(end - start +1)*2;
	 start= newStart;
 }
		
		return binarySearch(arr, target, start, end);
	}
	
	
	public static int binarySearch(int [] arr , int target , int start, int end) {
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			if( target < arr[mid]) {
				end = mid-1;
			}
			else if( target > arr[mid]) {
				start = mid+1;
			}
			else
				return mid;
			
		}
		return -1;
	}
	
}
