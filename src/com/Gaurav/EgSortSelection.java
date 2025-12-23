package com.Gaurav;

public class EgSortSelection {

	public static void array(int [] arr)
	{
		for(int i=0; i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}
	System.out.println();
	}
	
	public static void main(String[] args) 
	{
		int arr[]= { 3,6,1,8,12,2};
		for(int i=0;i<arr.length-1;i++) 
		{
			int min =i;
			for(int j=i+1;j<arr.length;i++) 
			{
				if(arr[min]>arr[j]) 
				{
					min=j;
			    }
	         }
			int temp= arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
	
	 }
	array(arr);
	}
	

}
