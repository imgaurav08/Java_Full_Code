package LeetCodeQuestions.SearchingQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int [] arr = {2};
        int target = 11;
        System.out.println(Arrays.toString(searchRange(arr,target)));

    }

    public static  int[] searchRange(int[] nums, int target) {
        int [] ans = new int[2];
        ans[0]= -1;
        ans[1]= -1;
        if (nums.length <1){
            return ans;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int elements : nums){
            list.add(elements);
        }
        ans[0] = list.indexOf(target);
        ans[1]=list.lastIndexOf(target);
        return  ans;
    }

}
