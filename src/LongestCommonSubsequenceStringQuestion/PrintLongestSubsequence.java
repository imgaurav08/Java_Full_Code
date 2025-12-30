package LongestCommonSubsequenceStringQuestion;

import java.util.Arrays;

public class PrintLongestSubsequence {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(printSubSequence(s1,s2));

    }


    public static int[][] lcsTable(String str, String temp){
        int n = str.length();
        int m = temp.length();
        int[][] dp = new int[n+1][m+1];
        for (int i=1 ; i<=n;i++){
            for (int j=1; j<=m; j++){
                if (str.charAt(i-1)==temp.charAt(j-1)){
                    dp[i][j]= 1+ dp[i-1][j-1];
                }else {
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp;
    }

    public static String printSubSequence(String str,String temp){
        int[][] dp = lcsTable(str,temp);
        int i= str.length();
        int j= temp.length();

        StringBuilder sb = new StringBuilder();
        while (i>0 && j>0){
            if (str.charAt(i-1) == temp.charAt(j-1)){
                sb.append(str.charAt(i-1));
                i--;
                j--;
            } else if (dp[i-1][j] > dp[i][j-1]) {
                i--;
            } else {
                j--;
            }
        }
        return sb.reverse().toString();
    }

}
