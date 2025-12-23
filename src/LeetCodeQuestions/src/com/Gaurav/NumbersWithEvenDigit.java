package LeetCodeQuestions.src.com.Gaurav;

public class NumbersWithEvenDigit {

	public static void main(String[] args) {
		int [] arr = {3,45,232,44,10001,8000, 12};
		System.out.println(evenDigit(arr));

	}
	static int evenDigit(int [] arr) {
		int count =0;
		for(int number : arr) {
			if(String.valueOf(number).length() % 2 == 0)
				count ++;
		}
		return count;
	}
}
