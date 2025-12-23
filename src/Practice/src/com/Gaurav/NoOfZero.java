package com.Gaurav;

public class NoOfZero {

	public static void main(String[] args) {
  		
    System.out.println(count(30300));
	}

	public static int count(int num) {
		int count =0;
		while(num!=0) {
			int rem = num % 10;
			if(rem == 0) {
				count++;
		}
			num/=10;
		}
		return count;
	}
	
}
