package Patterns.src.com.Gaurav;

public class Eg2 {

	public static void main(String[] args) {
		pattern2(4);
	}

	
	public static void pattern2(int n) {
		for(int row =0 ; row < n ; row ++) {
			for(int col =0 ; col<n; col++) {
				System.out.print("* "+ "");
			}
			System.out.println();
		}
	}
	
}


//o/p
//* * * *
//* * * *
//* * * *
//* * * *