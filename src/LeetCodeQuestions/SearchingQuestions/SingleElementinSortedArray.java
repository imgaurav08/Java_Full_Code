package LeetCodeQuestions.SearchingQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleElementinSortedArray {
    public static void main(String[] args) {
 int [] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] nums) {

        int unique = 0;

        for (int n : nums){
            unique ^= n;
        }

       return unique;

    }

    }

