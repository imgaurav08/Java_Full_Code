package com.Gaurav;

public class PrimeNumberEg {
 
	public static void main(String[] args) {
		int num=10;
		for(int i= 0 ; i <=num ; i++) {
			System.out.println(i+ " " + isPrime(i));
		}
	}
	
	public static boolean isPrime(int num) {
		if(num<=1)
			return false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
}
