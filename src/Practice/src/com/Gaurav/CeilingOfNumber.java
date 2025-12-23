package Practice.src.com.Gaurav;

// celing of number is find that number from the array which is least integer number which is greater than or equal to the target number

public class CeilingOfNumber {

	public static void main(String[] args) {
		int [] arr = {2,3,5,9,14,16,18};
		int target =15;
		System.out.println(ceilingNumber(arr, target));
		
	}
 static int ceilingNumber(int [] arr , int target) {
	int s=0;
	int e=arr.length-1;
		if (target> arr[arr.length-1]){
		return -1;
	}
		while (s<=e){
			int mid =s+(e-s)/2;
			if (target <arr[mid]){
				e=mid-1;
			}else if(target > arr[mid])
			{
				s=mid+1;
			}else {
				return mid;
			}
		}
return arr[s];
 }
	
}
