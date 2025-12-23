package LeetCodeQuestions.ArraysQuestions;

import java.util.Arrays;

public class RichestWealth {
    public static void main(String[] args) {
            int arr [][] = {
                    {1,2,3},
                    {3,2,1}
            };
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
                int ans = Integer.MIN_VALUE;
            for (int [] row : accounts){
                int sum =0;
                for (int col : row){
                    sum+=col;
                }
                if (sum > ans){
                    ans = sum;
                }
            }
           return ans;
    }
    }

