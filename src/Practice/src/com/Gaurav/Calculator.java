package com.Gaurav;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double result;
		
		System.out.println("Enter the operator ");
		char operator= scn.next().trim().charAt(0);
		
		System.out.println("Enter the first number");
		double num1= scn.nextDouble();
		
		System.out.println("Enter the second number");
		double num2= scn.nextDouble();
		
		
		switch (operator) {
		case '+':
			result=num1+num2;
			System.out.println("Sum of two number is" + result);
			break;
			
		case '-':
			result=num1-num2;
			System.out.println("Sum of two number is" + result);
			break;
			
		case '*':
			result=num1*num2;
			System.out.println("Sum of two number is" + result);
			break;
			
		case '/':
			if(num2!=0) {
				result=num1/num2;
			}
			else
				System.out.println("Cannot be deterimend");

		default:
			System.out.println("Invalid Operation");
			break;
		}
		

	}

}
