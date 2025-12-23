package Practice.src.com.Gaurav;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int[]arr){
        int s=0;
        int e=arr.length-1;
        int temp=0;
        while (s <e){
            temp = arr[s];
            arr[s]=arr[e];
            arr[e]= temp;
            s++;
            e--;
        }
        return arr;
    }

}
