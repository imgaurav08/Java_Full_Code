package com.Gaurav;

import java.util.ArrayList;
import java.util.List;

public class Dice {

	public static void main(String[] args) {
	  //   dicePattern("", 4);	

		System.out.println(diceP("", 4));
	}

	public static void dicePattern(String p , int target) {
		if(target == 0) {
			System.out.println(p);
			return;
		}
		
		for(int i=1 ;i<=6 && i<=target ; i++) {
			dicePattern(p+i, target-i);
		}
	}
	
	
	public static List<String> diceP(String p, int target){
		if(target==0) {
			List<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}	
		
		
		ArrayList<String> arrayList = new ArrayList<>();
		for(int i =1 ; i<=6 && i<=target; i++) {
			arrayList.addAll(diceP(p+i, target-i));
		}
		return arrayList;
	}
	
}
