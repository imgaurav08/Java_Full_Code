package HashMap;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        countFrequency("hello");
    }

    public static void countFrequency(String str){
        Map<Character,Integer> map = new HashMap<>();
       for (int i=0; i < str.length();i++){
        map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
       }
        System.out.println(map);
    }
}
