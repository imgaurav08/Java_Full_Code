package GFGCoding.ArraysQuestions;

import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
 int [] arr= {1, 2, 3, 4, 5};
 rotateArr(arr,2);
    }
   public static void rotateArr(int arr[], int d) {
int l=arr.length;
        d%=l;
        rotateArrayLeft(arr,0,d-1);
       rotateArrayLeft(arr,d,l-1);
       rotateArrayLeft(arr,0,l-1);

    }

    public static void rotateArrayLeft(int []arr, int start, int end){
        while (start < end){
            int temp = arr[end];
            arr[end]= arr[start];
            arr[start]= temp;
            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
