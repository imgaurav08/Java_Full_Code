package JavaStreamApi;

import java.util.Arrays;
import java.util.List;

public class SquareAndFilterAndAverage {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,2,7,9,10,15);


        Double as = list.stream()
                .map(n->n*n)
                .filter(n->n*n>100)
                        .mapToInt(Integer::intValue)
                                .average()
                                        .getAsDouble();
        System.out.println(as);
    }
}
