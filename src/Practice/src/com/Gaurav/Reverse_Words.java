package Practice.src.com.Gaurav;

import java.util.Stack;

public class Reverse_Words {
    public static void main(String[] args) {
        String str ="The Sky is blue";
        System.out.println(reverse(str));
    }

    public static String reverse(String str){
     Stack <String> stack = new Stack<>();
        StringBuilder temp= new StringBuilder();
      String [] word =  str.split(" ");
      for (int i= 0; i <=word.length-1 ; i++){
        stack.push(word[i]);
      }
    while (!stack.isEmpty()){
       temp.append(stack.pop());
       temp.append(" ");
    }
      return temp.toString().trim();
    }
       /* String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i=words.length-1;i>=0;i--){
           sb.append(words[i]);
           sb.append(" ");
       }
       return sb.toString().trim();
    }*/

}
