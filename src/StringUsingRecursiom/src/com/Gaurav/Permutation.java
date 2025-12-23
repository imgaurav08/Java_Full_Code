package StringUsingRecursiom.src.com.Gaurav;

public class Permutation {

	public static void main(String[] args) {
		
		combination("", "abc");

	}

	public static void combination(String p , String up) {
		
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		for(int i = 0 ; i <= p.length(); i++) {
			String one = p.substring(0, i);
			String two = p.substring(i, p.length());
			combination(one + ch + two, up.substring(1));
		}
	}
	
	
}
