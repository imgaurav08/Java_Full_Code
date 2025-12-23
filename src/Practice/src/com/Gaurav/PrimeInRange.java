package Practice.src.com.Gaurav;

public class PrimeInRange {

	public static void main(String[] args) {
		int num=40;
  rangePrime(num);
	}

	public static void rangePrime(int num) {
		for(int i=2 ; i <= Math.sqrt(num);i++) {
			if(num % i ==0) {
				System.out.println(num);
			}
			System.out.println(i);
		}
	}
	 
}
