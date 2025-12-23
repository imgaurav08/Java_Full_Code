package Practice.src.com.Gaurav;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimenssionalArray {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int arr[][] = new int[3][4];
		for(int row=0;row<arr.length;row++) {
			for(int col=0; col<arr[row].length;col++) {
				arr[row][col]=scn.nextInt();
			}
		}
		for (int[] result : arr) {
			System.out.println(Arrays.toString(result));
		}

	}

}
