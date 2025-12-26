package DynamicProgramming.UnboundedKnapSack;

public class CoinChangeMaximumWay {
    public static void main(String[] args) {
  int [] arr ={2};
  int sum = 3;
        System.out.println(change(sum,arr));
    }

    public  static int change(int amount, int[] coins) {
int length = coins.length;
int [][] dp = new int[length+1][amount+1];
for (int i=0;i<=length;i++){
    dp[i][0]=1;
}

for (int i=1 ; i<=length;i++){
    for (int j=1;j<=amount;j++){
        if (coins[i-1] <= j){
            dp[i][j]= dp[i][j-coins[i-1]] + dp[i-1][j];
        } else {
            dp[i][j]=   dp[i-1][j];
        }
    }
}
 return dp[length][amount];
    }
}
