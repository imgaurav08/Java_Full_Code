package DynamicProgramming.UnboundedKnapSack;

public class CoinChangeMinimum {
    public static void main(String[] args) {
   int[] arr = {2};
   int amount = 3;
        System.out.println(coinChange(arr,amount));
    }


    public static int coinChange(int[] coins, int amount) {
   int length = coins.length;
   int [][] dp = new int[length+1][amount+1];

   for (int j=1 ; j<=amount;j++){
       dp[0][j] = Integer.MAX_VALUE-1;
   }
        for (int i=1 ; i<=length;i++){
            for (int j=1; j<=amount;j++){
                if (coins[i-1] <= j){
                    dp[i][j]= Math.min(
                            1+ dp[i][j-coins[i-1]], dp[i-1][j]
                    );
                } else {
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
  return dp[length][amount] >= Integer.MAX_VALUE-1 ?-1 :dp[length][amount];
    }

}
