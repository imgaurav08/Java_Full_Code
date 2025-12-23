package StringUsingRecursiom.src.com.Gaurav;

public class SkipCharacterinString {

	public static void main(String[] args) {
		System.out.println(skipChar("baacdaah"));
		
	}

	public static String skipChar(String primary) {

		if (primary.isEmpty()){
			return "";
		}
		char ch =primary.charAt(0);
		/*if (ch =='a'){
			return skipChar(primary.substring(1));
		}
		else{
			return ch +skipChar(primary.substring(1));
		}*/

		return ch=='a'?skipChar(primary.substring(1)):ch +skipChar(primary.substring(1));
	}
	
}
