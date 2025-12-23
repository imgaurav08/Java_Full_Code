package LeetCodeQuestions.ArraysQuestions;


import java.util.*;

public class SentencePanagram {
    public static void main(String[] args) {
  String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(str));
    }
    public static boolean checkIfPangram(String sentence) {

        String ab = "abcdefghijklmnopqrstuvwxyz";
        boolean isPresent = true;
        for(int i=0; i<ab.length(); i++){
            String str = ab.charAt(i)+"";
            if(!sentence.contains(str)){
                isPresent = false;
                break;
            }
        }
        return isPresent;
    }
}
