package LeetCodeQuestions.ArraysQuestions;

import java.util.Arrays;

public class MoveZeroToLeft {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 4, 0, 5};
        move(arr);

    }
    public static void move(int[] arr) {
    int count =arr.length-1;
    for (int i =arr.length-1; i >=0; i--){
        if (arr[i]!=0){
            arr[count]=arr[i];
            count--;
        }
    }
    while (count>=0){
        arr[count]=0;
        count--;
    }
        System.out.println(Arrays.toString(arr));
    }
}
