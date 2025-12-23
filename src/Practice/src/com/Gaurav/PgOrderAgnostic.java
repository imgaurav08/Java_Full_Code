package com.Gaurav;

public class PgOrderAgnostic {

	public static void main(String[] args) {
//		int []arr = {90,87,65,34,9,4};
//           int target = 34;
		 int [] arr = { -1,0,2,45,67,89,100,2324,3333};
		   int target = 67;
            System.out.println(orderAgnoestic(arr, target));
	}

	static int orderAgnoestic(int [] arr , int target) {
		int start = 0;
		int end = arr.length-1;
		boolean isAscending = arr[start] < arr[end];
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(arr[mid]== target)
				return mid;
		if(isAscending) {
			if(target > arr[ mid]) {
				 start = mid +1;
			 }
			 else {
				 end = mid-1;
			 }
		}
		else  if(target > arr[mid]) {
			  end = mid-1;
		  }
		  else  {
			  start = mid+1;
		  }
		}
		return -1;
	}
	
}
