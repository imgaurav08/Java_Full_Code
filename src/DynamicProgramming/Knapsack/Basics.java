package DynamicProgramming.Knapsack;

import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
        int[] weights = {2, 5, 6, 7};
        int[] values = {1, 2, 3, 1};
        int maxCapacity = 8;
        int size = weights.length;
        System.out.print("Max profit using recursion is " + getMaxProfitRecursion(weights,values,maxCapacity,size));

        int [][] dp = new int[size+1][maxCapacity+1];
        for (int i=0; i<= size;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(" ");
        System.out.println("Max profit using Memoization is " + getMaxProfitMemoization(weights,values,maxCapacity,size,dp));

        System.out.println(" ");
        System.out.println("Max profit using Top-down is " + getMaxProfitTopDownIterative(weights,values,maxCapacity,size));

    }

//Normal Recursion

public static int getMaxProfitRecursion(int [] weight,int [] values,int maxCapacity,int n){
        if (maxCapacity==0 || n==0){
            return 0;
        }

        if (weight[n-1] <= maxCapacity){
            return  Math.max(values[n-1]+ getMaxProfitRecursion(weight,values,maxCapacity-weight[n-1],n-1),
                    getMaxProfitRecursion(weight,values,maxCapacity,n-1));
        }
        return        getMaxProfitRecursion(weight,values,maxCapacity,n-1);

}

//Memoization

    public static int getMaxProfitMemoization(int [] weight,int [] values,int maxCapacity,int n,int [][] dp) {
if (maxCapacity==0|| n==0){
    return 0;
}
        if (dp[n][maxCapacity]!=-1){
            return dp[n][maxCapacity];
        }
        if (weight[n-1] <= maxCapacity){
            return dp[n][maxCapacity] = Math.max(values[n-1]+ getMaxProfitMemoization(weight,values,maxCapacity-weight[n-1],n-1,dp),
                    getMaxProfitMemoization(weight,values,maxCapacity,n-1,dp));
        }
        return   dp[n][maxCapacity]=     getMaxProfitMemoization(weight,values,maxCapacity,n-1,dp);
    }

    // Top-down iterative

    public static int getMaxProfitTopDownIterative(int [] weight,int [] values,int maxCapacity,int n) {
    //Recursion ki base condition ko iterative banege
        // jo chize change ho rhi h unko bs i,j ke sath replace krna hai apne case m size or maxCapacity change ho rhe h bs
        int [][] dp = new int[n+1][maxCapacity+1];
        for (int i =1 ; i <=n;i++){
            for (int j=1 ; j <=maxCapacity; j++){
if (weight[i-1] <= j){
    dp[i][j]=  Math.max(values[i-1]+dp[i-1][j-weight[i-1]],dp[i-1][j]);
} else {
    dp[i][j]= (dp[i-1][j]);
}


            }
        }
        return dp[n][maxCapacity];
    }
    }


