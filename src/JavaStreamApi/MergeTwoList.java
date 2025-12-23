package JavaStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,52,5,1,5,12);
        List<Integer> list1= Arrays.asList(12,54,512,95,10,588,102);
        List<Integer> collect = Stream.concat(list.stream(), list1.stream()).sorted().toList();
        System.out.println(collect);



    }
}
