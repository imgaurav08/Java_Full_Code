package com.Gaurav;

public class Eg4 {

	public static void main(String[] args) {
		pattern4(6);

	}

	    public static void pattern4(int n) {
	    	for( int row=0 ; row < n ; row++) {
	    		int count=0;
	    		for(int col=0; col <=row; col++) {
	    			System.out.print(++count + " ");
	    		}
	    		System.out.println();
	    	}
	    }
}


//o/p
//1
//1 2
//1 2 3
//1 2 3 4