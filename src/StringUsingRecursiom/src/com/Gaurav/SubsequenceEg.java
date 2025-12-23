package StringUsingRecursiom.src.com.Gaurav;

public class SubsequenceEg {

	public static void main(String[] args) {
		
		sequence("", "abc");

	}

	public static void sequence( String empty , String full) {
		if (full.isEmpty()){
			System.out.println(empty);
			return ;
		}
		char ch = full.charAt(0);
		sequence(empty,full.substring(1));
		sequence(ch+empty,full.substring(1));

	}
	
	
	
}
