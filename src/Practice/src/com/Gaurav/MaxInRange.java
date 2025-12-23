package Practice.src.com.Gaurav;

public class MaxInRange {

	public static void main(String[] args) {
		int [] arr= {2,4,5,3,7,92,1,455,790,23};
		maxInRange(arr,2,8);
           
	}

	public static void maxInRange(int[] arr ,int start , int end) {
		int max= arr[start];
		for(int i=start;i<end;i++) {
			if(arr[start]<arr[i]) {
				max=arr[i];
			}
		}
	 System.out.println(max);
	}
}
