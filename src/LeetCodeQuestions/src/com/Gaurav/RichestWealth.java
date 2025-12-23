package com.Gaurav;

public class RichestWealth {

	public static void main(String[] args) {
		int[][] accounts= { {2,8,7},{7,1,3},{1,9,5} };
              System.out.println(maximumWealth(accounts));
	}
	
	
	static int maximumWealth(int[][] accounts) {
	  int ans = Integer.MIN_VALUE;    
	  for(int[] row : accounts) {
		  int sum =0;
		   for( int col : row) {
			   sum+=col;
		   }
	   if(sum > ans)
		   ans =sum;
	  }
	  
	  return ans;
	}
	
}


