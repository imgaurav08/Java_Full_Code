package JavaStreamApi;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

        // Through mapToInt()

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}
