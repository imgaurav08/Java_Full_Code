package GFGCoding.ArraysQuestions;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
int []arr = {1, 2, 0, 4, 3, 0, 5, 0};
pushZerosToEnd(arr);
moveLeft(arr);
    }

   public static void pushZerosToEnd(int[] arr) {
int count =0;
for (int i=0; i< arr.length;i++){
    if (arr[i]!=0) {
        arr[count]= arr[i];
        count++;
    }
}
while (count < arr.length){
    arr[count++]=0;
}
       System.out.println(Arrays.toString(arr));
    }

    public static void moveLeft(int [] arr){
        int count = arr.length-1;
        for (int i = arr.length-1; i>=0 ; i--){
            if (arr[i]!=0){
                arr[count] = arr[i];
                count--;
            }
        }

        while (count>=0){
            arr[count--]=0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
