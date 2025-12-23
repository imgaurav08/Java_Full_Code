package LeetCodeQuestions.src.com.Gaurav;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));

	}
	
	
public static List<Integer> findDisappearedNumbers(int[] nums) {
    int i =0 ;
    while(i < nums.length) {
    	int correctIndex= nums[i]-1;
    	if(nums[i] != nums[correctIndex]) {
    		swap(nums , i , correctIndex);
    	}
    	else
    		i++;
    }
    
    List<Integer> ans = new ArrayList<Integer>();
    for(int index =0; index < nums.length; index++) {
    	if(nums[index]!= index+1) {
    	ans.add(index+1);
    	}
    }
    return ans;
   }

public static void swap(int [] nums , int first , int second) {
	int temp= nums[first];
	nums[first]= nums[second];
   nums[second]= temp;
}

}
