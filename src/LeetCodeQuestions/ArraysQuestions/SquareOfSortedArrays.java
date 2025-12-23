package LeetCodeQuestions.ArraysQuestions;

import java.util.Arrays;

public class SquareOfSortedArrays {
    public static void main(String[] args) {
 int [] nums ={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {
    int[] result = new int[nums.length];
        int length=nums.length-1;
    int s=0;
    int l= nums.length-1;
    while (s <= l){
        if (nums[s]*nums[s] < nums[l]*nums[l]){
            result[length] = nums[l]*nums[l];
            l--;
        } else {
            result[length] = nums[s]*nums[s];
            s++;
        }
        length--;
    }
    return result;


    }
}

