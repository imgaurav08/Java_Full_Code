package Practice.src.com.Gaurav;

public class OddorEven {

	public static void main(String[] args) {
		
		int n= 5601;
		System.out.println(isOdd(n));

	}

	public  static boolean isOdd(int n) {
		return (n & 1 )==1; 
	}

}
