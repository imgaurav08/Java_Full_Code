package LearnSlidingWindow;

import java.util.HashSet;

public class Length_Of_Largest_SubString {
    public static void main(String[] args) {
  String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }

//    public  static int lengthOfLongestSubstring(String s) {
//     int start=0;
//     int end =0;
//     int Max=0;
//        HashSet<Character> hashSet = new HashSet<>();
//    while (end<s.length()){
//        if (!hashSet.contains(s.charAt(end))){
//            hashSet.add(s.charAt(end));
//            end++;
//            Max = Math.max(Max,hashSet.size());
//        }else {
//            hashSet.remove(s.charAt(start));
//            start++;
//        }
//    }Ha
//return Max;
//    }


    public  static int lengthOfLongestSubstring(String s) {
    int max =0;
    int start =0;
    int end =0;
    HashSet<Character> set = new HashSet<>();
    while (end < s.length()){
        if (!set.contains(s.charAt(end))){
            set.add(s.charAt(end));
            max= Math.max(max,set.size());
            end++;
        } else {
            set.remove(s.charAt(start));
            start++;
        }
    }
    return max;
    }
    }
