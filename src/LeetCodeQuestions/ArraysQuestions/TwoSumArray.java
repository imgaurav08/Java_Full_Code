package LeetCodeQuestions.ArraysQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int target = 6;
       // System.out.println(Arrays.toString(bruteForce(arr, target)));
        System.out.println(Arrays.toString(mapApproach(arr,target)));
    }

    public static int[] bruteForce(int[] arr, int target){
        for (int i=0; i<arr.length;i++){
            for (int j=i+1; j<arr.length;j++){
if (arr[i]+arr[j]==target){
    return new int[] {i,j};
}
            }
        }
        return null;
    }

    public static int[] mapApproach(int[] arr, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<arr.length;i++){
            int findMe= target-arr[i];
            if (map.containsKey(findMe)){
                return new int[] {map.get(findMe),i};
            }
            map.put(arr[i],i);
        }
return null;

    }
}
