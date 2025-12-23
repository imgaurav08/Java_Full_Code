package SearchingAndSorting.src.com.Gaurav;

public class LinerSearch {

	public static void main(String[] args) {
   int [] arr = {3,4,2,5,6,1,8,-1,5,2,-222,-90};
   int target =-222;
   System.out.println(linearsearch(arr, target));
	}

	
	  static int linearsearch(int[] arr , int target) {
		  if(arr.length==0)
			  return-1;
		  for(int index=0;index <arr.length; index++) {
			  if(arr[index]==target)
				  return index;
		  }
	    return -1;
   
  
	  }
}
