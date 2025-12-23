package LeetCodeQuestions.Strings;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
    public static String reverseWords(String s) {
  String [] str = s.split(" ");
  StringBuilder builder = new StringBuilder();
  for (int i=str.length-1; i>=0;i--){
      builder.append(str[i]);
      builder.append("");
  }
  return builder.toString().trim();
    }

}
