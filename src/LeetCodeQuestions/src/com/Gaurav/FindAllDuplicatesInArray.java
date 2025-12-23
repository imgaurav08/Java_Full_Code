package LeetCodeQuestions.src.com.Gaurav;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
 int [] arr ={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicate(arr));
    }

    public static ArrayList<Integer> findDuplicate(int[] arr){
        int i=0;
        while (i < arr.length){

            int correct = arr[i]-1;
            if (arr[i] != arr[correct]){
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int index =0; index < arr.length; index++){
            if (arr[index]!= index+1){
                list.add(arr[index]);
            }
        }
        return list;
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp= arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }


}
