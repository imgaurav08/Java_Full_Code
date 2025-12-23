package com.Gaurav;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {

	public static void main(String[] args) {
		
		System.out.println(letterCombinations("12"));

	}

	public static List<String> letterCombinations(String digits) {
     
	return pad("", "12");
	}
	
	public static List<String> pad(String p , String up){
	
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		
		int digit = up.charAt(0) -'0';
		
		ArrayList<String> arr = new ArrayList<>();
		for(int i = (digit-1)*3 ; i< digit*3; i++) {
			char ch = (char) ('a' + i);
		 arr.addAll(pad(p+ch, up.substring(1)));
		}
		
		return arr;
	}
	
}
