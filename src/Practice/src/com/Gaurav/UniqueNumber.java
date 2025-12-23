package Practice.src.com.Gaurav;

public class UniqueNumber {

	public static void main(String[] args) {
	int []  arr = {2,3,4,5,2,3,4};
	System.out.println(findUnique(arr));

	}

	public static int findUnique(int [] arr) {
		int unique =0;
		for( int num : arr) {
			unique^=num;
		}
		return unique;
	}
	
}
