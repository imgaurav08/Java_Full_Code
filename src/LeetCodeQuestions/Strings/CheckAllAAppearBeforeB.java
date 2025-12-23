package LeetCodeQuestions.Strings;

public class CheckAllAAppearBeforeB {
    public static void main(String[] args) {
        String str ="aaabbb";
        System.out.println(checkString(str));
        System.out.println(checkString1(str));
    }
    public static boolean checkString(String s) {
 return s.matches("a*b*");
    }

//brute force
    public static boolean checkString1(String s) {
       for (int i =0; i <s.length()-1;i++){
           if (s.charAt(i)=='b' && s.charAt(i+1)=='a'){
               return false;
           }
       }
       return true;
    }
}
