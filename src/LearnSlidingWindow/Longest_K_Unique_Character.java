package LearnSlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Longest_K_Unique_Character {
    public static void main(String[] args) {
        String str = "aabacbebebe";
        int size =3;
        System.out.println(longestSubString(str,size));
    }

//    public static int longestSubString(String str, int size){
//       HashMap<Character,Integer> map = new HashMap<>();
//       int max =-1;
//       int right =0;
//       int left =0;
//       while (left < str.length()){
//           map.put(str.charAt(left), map.getOrDefault(str.charAt(left),0)+1);
//           while (map.size() > size){
//               map.put(str.charAt(right), map.getOrDefault(str.charAt(right),0)-1);
//               if (map.get(str.charAt(right))==0){
//                   map.remove(str.charAt(right));
//               }
//               right++;
//           }
//
//           if (map.size()==size){
//               max = Math.max(max,left-right+1);
//           }
//           left++;
//       }
//       return max;
//    }

    public static int longestSubString(String str ,int size){
        int max =-1;
        int start =0;
        int end =0;
        Map<Character,Integer> map = new HashMap<>();
        while (end < str.length()){
            map.put(str.charAt(end),map.getOrDefault(str.charAt(end),0)+1);
            if (map.size() > size){
                map.put(str.charAt(start),map.getOrDefault(str.charAt(start),0)-1);
                if (map.get(str.charAt(start))==0){
                    map.remove(str.charAt(start));
                }
                start++;
            }
            if (map.size() ==size){
                max=Math.max(max,end-start+1);
            }
            end++;

        }
     return max;
    }


}
