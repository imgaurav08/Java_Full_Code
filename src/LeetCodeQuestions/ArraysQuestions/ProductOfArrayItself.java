package LeetCodeQuestions.ArraysQuestions;

import java.util.Arrays;

public class ProductOfArrayItself {
    public static void main(String[] args) {
  int [] arr ={-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums) {

        int [] left = new int[nums.length];
        int [] right = new int[nums.length];

        left[0]=1;
        right[nums.length-1]=1;

        for (int i = 1; i <nums.length ; i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        for (int i = nums.length-2; i >-1 ; i--) {
            right[i] =right[i+1]* nums[i+1];
        }

        int [] result = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            result[i] = left[i]*right[i];
        }
 return  result;

    }
}

/*int product =1;
        if (nums.length==0){
            return new int[] {};
        }







      *//*  int[] ans = new int[nums.length];
        if(nums.length > 2 && nums.length <= Math.pow(10,5)){
            for (int i = 0; i < nums.length; i++) {

                int product = 1;
                for (int j = 0; j < nums.length; j++) {
                    if(i==j){
                    }else{
                        product *= nums[j];
                        ans[i] = product;
                    }
                }

            }
        }

        return ans;*//*

        int[] ans = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            int product =1;
            for (int j = 0; j <nums.length ; j++) {
                if (nums[i]!=nums[j]){
                    product*=nums[j];
                }
            }
            ans[i]=product;
        }
        return ans;*/
