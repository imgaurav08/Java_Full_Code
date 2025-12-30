package LongestCommonSubsequenceStringQuestion;

public class LongestCommonSubSequence {
    public static void main(String[] args) {
     String up = "adcdeg";
     String down ="adcgrho";
     int length1 = up.length();
     int length2 = down.length();
        System.out.println(recursiveApproach(up,down,length1,length2));
        System.out.println();
        System.out.println(topDown(up,down,length1,length2));
    }

    public static int recursiveApproach(String up, String down, int length1,int length2){
        //Base condition
        if (length1 ==0 || length2==0){
            return 0;
        }

        if (up.charAt(length1-1) == down.charAt(length2-1)){
            return 1+ recursiveApproach(up,down,length1-1,length2-1);
        }
else {
    return Math.max(recursiveApproach(up,down,length1-1,length2),
            recursiveApproach(up,down,length1,length2-1));
        }
    }


    public static int topDown(String str, String temp, int n, int m){
        int [][] dp = new int[n+1][m+1];
        for (int i=1 ; i<=n;i++){
            for (int j=1; j<=m;j++){
                if (str.charAt(i-1) == temp.charAt(j-1)){
                     dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }


}
