package LeetCodeQuestions.ArraysQuestions;

import java.util.HashMap;
import java.util.HashSet;

public class MajorityElements {
    public static void main(String[] args) {
int [] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int length = nums.length;
for (int num : nums){
    map.put(num,map.getOrDefault(num,0)+1);
    if (map.get(num) > length/2){
        return num;
    }
}
return -1;
    }
}
