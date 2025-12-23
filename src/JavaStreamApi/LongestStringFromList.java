package JavaStreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestStringFromList {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("gaurav","poonam","virat","cricket");
       String s= list.stream()
                .max(Comparator.comparing(String::length)).toString();
        System.out.println(s);
    }
}
