package LearnRecursion;

public class Palindrome {
    public static void main(String[] args) {
        String str="gaurav";
        System.out.println(isPalindrome(str,0,str.length()-1));
        System.out.println(isPalindromeTwoPointer(str,0,str.length()-1));
    }

    public static boolean isPalindrome(String str, int left, int right){
        if (left >= right){
            return true;
        }

        if (str.charAt(right)!=str.charAt(left)){
            return false;
        }
        return isPalindrome(str,left+1,right-1);
    }

    public static boolean isPalindromeTwoPointer(String str, int left, int right) {
     while (left <right){
         if (str.charAt(left)!= str.charAt(right)){
             return false;
         }
         left++;
         right--;
     }
     return true;
    }

}
