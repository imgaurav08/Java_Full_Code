import java.util.*;

public class SortUsingComparator implements Comparator {
    public static void main(String[] args) {
        TreeSet <Integer> integers = new TreeSet<>( new SortUsingComparator() );
        integers.add(23);
        integers.add(43);
        integers.add(24);integers.add(321);integers.add(2);integers.add(3);

        System.out.println(integers);


    }

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        if (i1 < i2){
            return -1;
        } else if (i1 > i2){
            return 1;
        }
        else {
            return 0;
        }
    }
}
