package LeetCodeQuestions.ArraysQuestions;

import java.util.Arrays;

public class MoveZerosToLast {


    public static void main(String[] args) {
        int [] arr= {0,1,0,3,12};
        move(arr);


    }
    public static void move(int[] arr){
        int count =0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]!=0){
                arr[count]= arr[i];
                count++;
            }
        }
        while (count< arr.length){
            arr[count++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }


}
