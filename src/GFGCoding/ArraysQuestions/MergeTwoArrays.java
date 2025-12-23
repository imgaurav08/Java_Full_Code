package GFGCoding.ArraysQuestions;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
       int []arr1 = { 1, 3, 4, 5};
       int[] arr2 = {2, 4, 6, 8};
        System.out.println(Arrays.toString(merge(arr1,arr2)));

    }

    public static int [] merge(int [] a, int []b){
        int [] result  = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length){
            if (a[i] < b[j]){
                result [k++] = a[i++];
            }else {
                result [k++] = b[j++];
            }
        }

        while (i < a.length){
            result [k++] = a[i++];
        }
        while ( j < b.length){
                result [k++] = b[j++];
        }
        return result;
    }

}
