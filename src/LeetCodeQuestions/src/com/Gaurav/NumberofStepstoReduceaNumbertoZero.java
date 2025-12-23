package LeetCodeQuestions.src.com.Gaurav;

public class NumberofStepstoReduceaNumbertoZero {

	public static void main(String[] args) {
		System.out.println(numberOfSteps(14));

	}

	public static int numberOfSteps(int num) {
		return helper(num, 0);
	}
	
	public static int helper(int n , int step) {
		if(n==0) {
			return step;
		}
		if(n % 2 ==0) {
			return helper(n/2, step+1);
		}
		
		return helper(n-1, step+1);
	}
	
}
