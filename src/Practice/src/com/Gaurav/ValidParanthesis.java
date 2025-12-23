package Practice.src.com.Gaurav;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String inputStr = "(({}))]";
        if (isValid(inputStr)){
            System.out.println("valid"); ;
        } else {
            System.out.println("no");
        }
    }

    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()){
            if (ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else {
                if (stack.isEmpty()){
                    return false;
                }

                char top = stack.peek();
                if ((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')){
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

}
