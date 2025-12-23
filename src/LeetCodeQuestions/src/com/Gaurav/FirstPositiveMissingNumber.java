package LeetCodeQuestions.src.com.Gaurav;

public class FirstPositiveMissingNumber {

	public static void main(String[] args) {
		int [] nums = {1,2,0};
		System.out.println(firstMissingPositive(nums));

	}

public static int firstMissingPositive(int[] nums) {
   int i=0;
   while (i <nums.length){
	   int c = nums[i]-1;
	   if (nums[i] > 0 && nums[i] <= nums.length && nums[i]!= nums[c]){
		int temp= nums[i];
		nums[i]= nums[c];
		nums[c]=temp;
	   } else {
		   i++;
	   }
   }

   for (int index =0; index <nums.length;index++){
	   if (nums[index]!=index){
		   return index +1;
	   }
   }
   return nums.length+1;
    		 
    }
}
