package LeetCodeQuestions;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
       int [] arr = {1,0,2};
        System.out.println(Arrays.toString(sortColors(arr)));
    }
    public static int[] sortColors(int[] nums) {
        int s =0;
        int e=nums.length-1;
        while (s<=e){
            if (nums[s] > nums[e]){
                swap(nums,s,e);
                e--;
            }else {
                s++;
            }
        }
return nums;
    }

    private static void swap(int []arr,int s, int e) {
        int temp= arr[s];
        arr[s]=arr[e];
        arr[e]=temp;


    }
}
