package LearnRecursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
int [] arr ={4,3,2,1};
        System.out.println(Arrays.toString(sort(arr,arr.length-1,0)));
    }

    public static int[] sort(int[] arr, int start, int end){
        if (start==0){
            return arr;
        }

        if (end < start){
            if (arr[end] > arr[end+1]){
                int temp= arr[end];
                arr[end]=arr[end+1];
                arr[end+1]=temp;
                return sort(arr,start,end+1);
            }

        }else {
            return sort(arr,start-1,0);
        }
        return arr;


    }

}
