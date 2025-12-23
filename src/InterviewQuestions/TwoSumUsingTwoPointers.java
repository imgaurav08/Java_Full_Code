package InterviewQuestions;

import java.util.Arrays;

public class TwoSumUsingTwoPointers {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr,target)));

    }

    public static int[] twoSum(int[] nums, int target) {
           int start =0;
           int end= nums.length-1;

           while (start<end){
               int sum = nums[start]+nums[end];
               if (sum==target){
                   return new int []{start,end};
               }else if (sum < target){
                   start++;
               }else {
                   end--;
               }
           }
        return new int []{-1,-1};
    }
}
