package Practice.src.com.Gaurav;

import java.util.HashSet;

public class LargestSubString {
    public static void main(String[] args) {
        String str = "pwwekw";
        System.out.println(largestSubString(str));
    }

    public static int largestSubString(String str){
        int start =0;
        int end =0;
        int max_length=0;

        HashSet<Character> hashSet = new HashSet<>();

        while (end<str.length()){
            if (!hashSet.contains(str.charAt(end))){
                hashSet.add(str.charAt(end));
                end++;
                max_length= Math.max(max_length,hashSet.size());
            }else {
                hashSet.remove(str.charAt(start));
                start++;
            }
        }
return max_length;
    }

}
