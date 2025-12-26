package DynamicProgramming.Knapsack;

public class CountOfMinimumSubsetDifference {
    public static void main(String[] args) {
int [] arr ={1, 1, 2, 3};
int difference= 1;
        System.out.println(countOfMinDifference(arr,difference));
    }

    public static int countOfMinDifference(int[] nums, int difference){
int totalSum =  getSum(nums);
        if ((totalSum + difference) % 2 != 0) {
            return 0;
        }
int target = (difference+totalSum)/2;
return getSubSetSumCount(nums, target);
    }

    public  static int getSum(int[]nums){
        int sum=0;
        for (int add : nums){
            sum=sum+add;
        }
        return sum;
    }

    public static int getSubSetSumCount(int[] nums, int target){
        int length = nums.length;
   int [][] dp = new int[length+1][target+1];
     for (int i=0 ; i<=length;i++){
         dp[i][0]=1;
     }

     for (int i=1; i<=length;i++){
         for (int j=1; j<=target;j++){
             if (nums[i-1] > j){
                 dp[i][j]= dp[i-1][j];
             }else {
                 dp[i][j]= dp[i-1][j-nums[i-1]]+ dp[i-1][j];
             }
         }
     }
     return dp[length][target];
    }

}
