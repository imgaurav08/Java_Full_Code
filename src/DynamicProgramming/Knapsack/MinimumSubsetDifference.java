package DynamicProgramming.Knapsack;

public class MinimumSubsetDifference {
    public static void main(String[] args) {
        int [] arr = {1,4};
        System.out.println(minDifference(arr));
    }

    public static int getTotalSum(int[] nums) {
int sum=0;
for (int temp : nums){
    sum= sum+temp;
}
return sum;
    }

    public static int minDifference(int[]nums){
int totalSum=  getTotalSum(nums);
boolean[][] dp = subsetSum(nums,totalSum);
  int n = nums.length;
  int minDifference = Integer.MAX_VALUE;
  for (int j=0; j<=totalSum/2; j++){
      if (dp[n][j]){
          minDifference= Math.min(minDifference,totalSum- 2*j);
      }
  }
  return minDifference;
    }

    public static boolean[][] subsetSum(int[] nums, int sum ){
        int n= nums.length;
        boolean[][] dp =new boolean[n+1][sum+1];
        for(int i=0; i<=n;i++){
            dp[i][0]=true;
        }
        for(int i=1; i<=n;i++){
            for (int j=1; j<=sum;j++){
                if (nums[i-1] <=j){
                    dp[i][j]= dp[i-1][j-nums[i-1]] || dp[i-1][j];
                }else {
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        return dp;
    }

}
