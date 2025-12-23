package DynamicProgramming.Knapsack;

public class EqualSumPartition {
    public static void main(String[] args) {
        int [] arr = {1, 5, 11, 5};
        System.out.println(" Top down answer is  " + helper(arr));
    }
// Recursive approach
    public static boolean helper(int[] arr){
        int sum =0;
        int size = arr.length;
        for (int num : arr){
            sum= sum+num;
        }

        if (sum%2 !=0) return false;
        int target = sum /2;
        return helper(arr , target, size);

    }

//    public static boolean helper(int [] arr, int target, int size){
//        if(target==0) return true;
//        if (size==0) return false;
//
//        if (arr[size-1] > target){
//            return helper(arr,target,size-1);
//        }
//        return helper(arr,target-arr[size-1],size-1) || helper(arr,target,size-1);
//    }


    // top down
    public static boolean helper(int [] arr, int target, int size){
       // Base condition ko fill
        boolean[][] dp= new boolean[size+1][target+1];
        for (int i =0 ; i <= size;i++){
            dp[i][0]= true;
        }
        for (int i=1 ; i <=size;i++){
            for (int j=1 ; j<= target;j++){
                // Replace size with i and target with j use recursion code
                if (arr[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
            }
        }
        return dp[size][target];
    }


}
