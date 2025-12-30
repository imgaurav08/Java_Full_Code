package LongestCommonSubsequenceStringQuestion;

public class SequencePatternMatch {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc","ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
    int l = lcsLength(s,t);
    return l == s.length();
    }

    public static int lcsLength(String s , String t){
        int n= s.length();
        int m = t.length();
        int [][] dp = new int[n+1][m+1];
        for (int i=1; i<=n;i++){
            for (int j=1; j<=m; j++){
                if (s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j]= dp[i-1][j-1]+1;
                }else {
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }

}
