package Practice.src.com.Gaurav;

import com.Gaurav.InfiniteArray;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EYInterviewQuestion {
    public static void main(String[] args) {
        List<Person>  list = List.of(new Person("Gaurav",18,"Bangalore"),
                new Person("Nishant",20,"Delhi"),
                new Person("Isha",35,"Gurgaon"),
                new Person("Avi",5,"Jaipur"),
                new Person("Kaniya",25,"Bangalore"));


       List<Person> alist =  list.stream().filter(e->e.getAge() > 18 && e.getCity().equals("Bangalore")).sorted((a,b) -> b.getAge() - a.getAge())
                .collect(Collectors.toList());


        List<Person> a1list =  list.stream().filter(e->e.getAge() > 18).sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());


        System.out.println(a1list);

        String str = "aabbabacc aabccd";

        Map<String,Long>  map = Arrays.stream(str.replace(" ","").split("")).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);


        Map<Character, Long> map1 = new HashMap<>();

        for (int i = 0; i < str.length()-1; i++) {
    long count =0;
            if(map1.containsKey(str.charAt(i))){
//count=map1.get(str.charAt(i));
                map1.put(str.charAt(i),map1.get(str.charAt(i))+1);

            }else{
                map1.put(str.charAt(i),1L);
            }

        }

        System.out.println(map1);


        List<Integer> list1 = List.of(1,5,6,8,9,11);
         int min =   list1.stream().min((a,b) -> a-b).get();
        System.out.println("min " +min);

        int max =   list1.stream().max((a,b)-> a-b).get();
        System.out.println("max " +max);

        int diff = max-min;
        System.out.println(diff);



//        Map<String,Long>  map2 = Arrays.stream(str.replace(" ","").split("")).
//               collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//
//
//        Stream<Map.Entry<String, Long>> sorted = map2.entrySet().stream().sorted((a, b) ->
//                Math.toIntExact(Long.valueOf(b.getValue()) - Long.valueOf(a.getValue())));
//
//
//        sorted.forEach(entry ->
//                System.out.println("Character: " + entry.getKey() + ", Frequency: " + entry.getValue()));
//

        // System.out.println(map);







    }
}
