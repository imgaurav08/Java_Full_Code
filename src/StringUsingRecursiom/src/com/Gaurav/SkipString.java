package StringUsingRecursiom.src.com.Gaurav;

public class SkipString {

	public static void main(String[] args) {
  
		System.out.println(skip("bbcapplefapp"));
		System.out.println(skipApp("bbcapplefapp"));
		
		
	}

	public static String skip(String temp) {
		
		if(temp.isEmpty()) {
			return "";
		}
		
		if(temp.startsWith("apple")) {
			return skip(temp.substring(5));
		}else {
			return temp.charAt(0) + skip(temp.substring(1));
		}
		
	}
	
	
	public static String skipApp(String str){
		if (str.isEmpty()){
			return "";
		}

		if (str.startsWith("app") && !str.startsWith("apple")){
			return skipApp(str.substring(3));
		}else {
			return str.charAt(0)+skipApp(str.substring(1));
		}

	}

}
