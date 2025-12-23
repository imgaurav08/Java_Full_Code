package DynamicProgramming.Knapsack;

public class SubSetSumProblem {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 10;

        System.out.println(" Final result is " + getSumRecursion(arr,arr.length,sum));
        System.out.println(" ");
        System.out.println(" Final result of Top down is " + getSum(arr,arr.length,sum));

    }

    // Using Recursion
    public static boolean getSumRecursion(int[] arr, int l,int sum){
        if (sum==0) return true;
        if (l==0) return false;

        if (arr[l-1] > sum){
            return  getSumRecursion(arr,l-1,sum);
        }
        return  getSumRecursion(arr,l-1,sum-arr[l-1]) || getSumRecursion(arr,l-1,sum);
    }


    // Top Down

    public static boolean getSum(int[] arr, int l,int sum){
        // Base condition
       boolean [][] dp = new boolean[l+1][sum+1];
       for (int i=0;i <= l ; i++){
           dp[i][0] = true;
       }
       for (int i=1 ; i <= l ;i++){
           for (int j=1 ; j<=sum;j++){
               if (arr[i-1] > j){
                   dp[i][j]= dp[i-1][j];
               }else {
                   dp[i][j] =dp[i-1][j-arr[i-1]] || dp[i-1][j];

               }
           }
       }
       return  dp[l][sum];
    }
}
