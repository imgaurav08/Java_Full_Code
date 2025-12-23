package GFGCoding.ArraysQuestions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
  int[] arr ={1,2};
  reverseArray(arr);
    }

    public static void reverseArray(int arr[]) {
       int start =0;
       int end =arr.length-1;
       int temp=0;
       while (start < end){
           temp= arr[end];
           arr[end]= arr[start];
           arr[start]=temp;
           start ++;
           end--;
       }
        System.out.println(Arrays.toString(arr));
    }
}
