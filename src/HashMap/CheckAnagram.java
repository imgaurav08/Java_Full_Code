package HashMap;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {
    public static void main(String[] args) {
        System.out.println(ifAnagram("sileont","listen"));
    }

//    public static boolean ifAnagram(String p, String up){
//        Map<Character,Integer> map = new HashMap<>();
//        for (int i=0; i < p.length();i++){
//            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
//        }
//        for (int i=0; i < up.length();i++){
//            char ch = up.charAt(i);
//           if (map.containsKey(ch)){
//map.put(ch, map.get(ch)-1);
//if (map.get(ch)==0){
//    map.remove(ch);
//}
//           }
//           else {
//               return false;
//           }
//        }
//
//        return map.isEmpty();


    public static boolean ifAnagram(String p, String up){
        Map<Character,Integer> map = new HashMap<>();
        for (int i =0 ; i<p.length();i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
        }
        for (int i =0; i < up.length();i++){
            if (map.containsKey(p.charAt(i))){
                map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)-1);
                if (map.get(p.charAt(i))==0){
                    map.remove(p.charAt(i));
                } else {
                    return false;
                }
            }
        }
        return map.isEmpty();
    }



    }

