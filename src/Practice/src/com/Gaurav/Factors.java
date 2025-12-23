package Practice.src.com.Gaurav;

public class Factors {

	public static void main(String[] args) {
		factors1(20);

	}

	public static void factors1(int num) {
		for (int i =1 ; i <=num ; i++) {
			if( num % i ==0)
				System.out.print(i + " ");
		}
	}
	
}
