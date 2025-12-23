package com.Gaurav;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println(sum(111));

	}

	public static int sum(int n) {
		int sum=0;
		while(n > 0) {
			int rem= n%10;
		 sum+=rem;
		 n/=10;
		}
		return sum;
	}
	
}
