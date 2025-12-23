package DynamicProgramming.Knapsack;

public class CountOfSubset {
    public static void main(String[] args) {
        int [] arr = {2, 5, 3, 6,8,10};
        int sum =10;
        System.out.println(" Recursive result is " + getCountRecursive(arr,sum,arr.length));
        System.out.println();
        System.out.println();
        System.out.println(" Top down approach " + getCount(arr,sum, arr.length));
    }

    // Recursion

public static int getCountRecursive(int [] arr, int sum , int size){
        if (sum==0) return  1;
    if (size==0) return  0;
    if (arr[size-1] > sum) return getCountRecursive(arr,sum,size-1);
    return getCountRecursive(arr,sum-arr[size-1],size-1) +getCountRecursive(arr,sum,size-1);

}

// Top Down
public static int getCount(int [] arr, int sum , int size){
   int [][] dp = new int[size+1][sum+1];
   // BAse condition ko initialize krna
for (int i=0; i <=size;i++){
    dp[i][0]=1;
}
for (int i =1 ; i<=size;i++){
    for (int j=1; j<= sum; j++){
        if (arr[i-1] > j) dp[i][j]= dp[i-1][j];
        else dp[i][j]= dp[i-1][j-arr[i-1]] + dp[i-1][j];
    }
}
 return dp[size][sum];
}

}
