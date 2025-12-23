package JavaStreamApi;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,8,10);
        Double average = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(average);

    }
}
