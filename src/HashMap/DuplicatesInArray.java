package HashMap;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int [] arr= {1, 3, 2, 3, 4, 3, 5,5};
        duplicate(arr);
    }

    public static void duplicate(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
      map.entrySet().stream().filter(entry -> entry.getValue() >1 ).forEach(System.out::println);
    }
}
