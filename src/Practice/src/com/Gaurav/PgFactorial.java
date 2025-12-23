package com.Gaurav;

import java.util.Scanner;

public class PgFactorial {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println(FirstFactorial(scn.nextInt()));

	}
	public static int FirstFactorial(int sum) {
		long fact=1;
		for (int i = sum; i < 0; i--) {
			fact*=sum;
		}
		return sum;
	}
}
