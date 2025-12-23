package LeetCodeQuestions.ArraysQuestions;

import java.util.Arrays;

 class RoatedArrayEg {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
       rotate(arr, 3);
    }

    public static void rotate(int[] nums,int k){
        k=k% nums.length;
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);
    }
    public static void reverseArray(int[]arr,int start,int end){
        while (start < end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }


}






