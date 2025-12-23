package com.Gaurav;

public class SmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		char [] letters = {'c','f','j'};
		System.out.println(nextGreatestLetter(letters, 'c'));
		
	}

	public static char nextGreatestLetter(char[] letters, char target) {
		return nextGreatestLetters(letters, target, 0, letters.length-1);
	      
    }
	static char nextGreatestLetters(char[] letters, char target,int start, int end) {
	if(start >=end) {
		return letters[0];
	}
	
	int mid = start + (end - start)/2;
	if(letters[mid] < target) {
		return nextGreatestLetters(letters,target,mid+1,end);
	}
	return nextGreatestLetters(letters,target,start,mid-1);
	}
}
