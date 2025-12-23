package InterviewQuestions;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4};
        System.out.println(Arrays.toString(product(arr)));

    }

    public static int [] product(int[] nums){
        int [] result = new int[nums.length];
        result [0]=1;
        for (int i=1; i<nums.length;i++){
            result[i] = result[i-1] * nums[i-1];
        }

        int product=1;
        for (int i = nums.length-1;i >=0;i--){
            result[i]= result[i]*product;
            product*=nums[i];
        }
return result;
}
    }
