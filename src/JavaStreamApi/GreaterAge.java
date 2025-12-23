package JavaStreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class GreaterAge {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(28,123343245,"Virat"),
                new Employee(27,12345,"Gaurav"),
                new Employee(24,123485,"Poonam")

        );
      /*  List<Employee> filteredEmployees = list.stream()
                .filter(e -> e.getAge() > 20)
                .toList();

        filteredEmployees.forEach(System.out::println);*/


        /*List<Employee> sortedEmployees = list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()) // Sort by age in descending order
                .toList();

        sortedEmployees.forEach(System.out::println);*/


  Double sal=  list.stream().mapToDouble(Employee::getSalary).average().getAsDouble();

        System.out.println(sal);

      int s=  list.stream().mapToInt(Employee::getSalary).sum();
        System.out.println(s);

   Optional<Employee> emp= list.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(emp);


    }



}
