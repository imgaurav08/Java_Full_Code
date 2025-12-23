package Practice.src.com.Gaurav;

// Flooring of a number is greatest number smaller or = target number

public class FlooringOfNumber {

	public static void main(String[] args) {
		 int [] arr = { -2,0,2,45,67,89,100,2324,3333};
		   int target = 4;
		   System.out.println(flooringOfNumber(arr, target));

	}
 
	 static int flooringOfNumber(int [] arr , int target) {
		 int start=0;
		 int end= arr.length-1;
		 while(start <= end) {
			 int mid = start + (end - start )/2;
			 if(target > arr[mid]) {
				 start= mid+1;
			 }
			 else
				 end=mid-1;
		 }
		
		 return end;
	 }
	
}
