 package com.Gaurav;

public class EvenDigitsinArray {

	public static void main(String[] args) {
		
		int [] arr= {3,45,232,44,10001,8000, 12};
		
  System.out.println(findEvenDigit(arr));
	}

	static int findEvenDigit(int []arr) {
		int count =0;
		for(int number : arr) {
			if(even(number))
				count++;
		}
	 return count ;
	}
	
	static boolean even(int number) {
		int numberofDigit =findCount(number);
		return numberofDigit % 2 == 0;
	}
	
	static int findCount(int number) {
		int count =0;
		while(number >0) {
			count++;
			number=number/10;
		}
	 return count;
	}
	
	
}
