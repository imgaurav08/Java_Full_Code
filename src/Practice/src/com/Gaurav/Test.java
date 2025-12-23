package Practice.src.com.Gaurav;

import com.Gaurav.InfiniteArray;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
Map<String, Integer> map = new HashMap<>();
map.put("gaurav",2);
        map.put("avi",3);map.put("nishant",4);map.put("kani",7);map.put("isha",8);
        map.put("ggggg",12);

        map.entrySet().stream().forEach(entry-> System.out.println(entry.getKey()));


    }

}
