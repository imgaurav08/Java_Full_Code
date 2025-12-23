package Practice.src.com.Gaurav;

import java.util.Scanner;

public class Solution {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		double number=scn.nextDouble();
		System.out.println("What would you like to calculate " +"\n"+ "(1)Sqrt"+"\n"+ "(2)Log"+"\n"+ "(3)Factorial");
		String calculate= scn.next();
		
	switch(calculate) {
	case "Sqrt" :
		double sqrt =Math.sqrt(number);
		System.out.println("The Sqrt of given number is "+ sqrt);
		break;
	
	case "Log":
		double log =Math.log(number);
	 System.out.println("The log value of Given number is  "+ log);
	 break;
	 
	case "Factorial":
		long factorial =1;
		for(int i=1; i<=number; i++) {
			factorial*=i;	
		}
		System.out.println("Factorial of given number is "+ factorial);
		break;
	default:
		System.out.println("Error Invalid operation select");
		break;
	}
		

	}

}
