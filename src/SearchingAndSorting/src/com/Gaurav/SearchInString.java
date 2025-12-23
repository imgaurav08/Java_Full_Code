package SearchingAndSorting.src.com.Gaurav;

public class SearchInString {

	public static void main(String[] args) {
		String str="khushboo";
	char target ='g';
	
	System.out.println(search(str,target));

	}

	 static boolean search(String str, char target) {
		 if(str.length()==0)
			 return false;
		 for(int index=0; index < str.length(); index++) {
			 if(str.charAt(index)== target) {
				 return true;
			 }
		 }
	  return false;
	 }
}
