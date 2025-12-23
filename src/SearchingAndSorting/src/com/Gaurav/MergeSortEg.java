package SearchingAndSorting.src.com.Gaurav;

import java.util.Arrays;

public class MergeSortEg {
    public static void main(String[] args) {
  int [] arr ={6,3,9,5,2,8};
        System.out.println(Arrays.toString(divide(arr,0,arr.length-1)));
    }

    public static int[] divide(int[] arr, int start, int end){
        if (start>=end){
            return arr;
        }

        int mid = start+(end-start)/2;
        divide(arr,0,mid);
        divide(arr,mid+1,end);
        return merge(arr,start,mid,end);

    }

    public static int[] merge(int[] arr, int start, int mid,int end){
        int[] result = new int[arr.length];
int i =start;
int j=mid+1;
int k=0;

while (i<=mid && j<=end){
    if (arr[i] <= arr[j]){
        result[k++]=arr[i++];
    }else {
        result[k++]=arr[j++];
    }
}
        while (i<=mid){
            result[k++]=arr[i++];
        }

        while (j<=end){
            result[k++]=arr[j++];
        }
        return result;

    }


}
