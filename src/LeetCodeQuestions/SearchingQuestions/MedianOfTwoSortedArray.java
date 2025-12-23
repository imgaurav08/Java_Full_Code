package LeetCodeQuestions.SearchingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
  int [] num1 = {1,3};
  int [] num2 = {2,7};
       // System.out.println(Arrays.toString(findMedianSortedArrays(num1,num2)));
        System.out.println(findMedianSortedArrays(num1,num2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int [] result = mergedArray(nums1,nums2);
        int mid = result.length/2;
        return result.length%2!=0 ? (double) result[mid] : (double) (result[mid-1] + result[mid])/2.0;
    }

    public static int[] mergedArray(int [] arr,int [] arr1){
        int [] resultArray = new int[arr.length + arr1.length];
        for (int i = 0; i <arr.length ; i++) {
            resultArray[i] = arr[i];
        }
        for (int j = 0; j <arr1.length ; j++) {
            resultArray[arr.length+j] = arr1[j];
        }
        Arrays.sort(resultArray);
        return resultArray;
    }
    }
