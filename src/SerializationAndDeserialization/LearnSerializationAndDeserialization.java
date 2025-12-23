package SerializationAndDeserialization;

import java.io.*;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Test {
    public static void main(String[] args) {
//int [] arr ={1,2,14,5,7};
        int [] arr ={1,2,14,5,7,2,2,5,10};
        duplicate(arr);

      //  System.out.println(checkIndex(arr,37,0));
       // System.out.println(checkSorted(arr,0));
    }

    /*public static boolean checkSorted(int[] arr,int index){
        if (index==arr.length-1){
            return true;
        }
        return arr[index] <arr[index+1] && checkSorted(arr,index+1);
    }*/

    public static int checkIndex(int [] arr, int target, int index){
        if (index==arr.length){
            return -1;
        }
        /*if (target==arr[index]){
            return index;
        }else {
            return checkIndex(arr,target,index+1);
        }*/

        return  target==arr[index]?index:checkIndex(arr,target,index+1);
    }

    public static void duplicate(int[] arr){
        Map<Integer,Integer>  map = new HashMap<>();
        for (int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
      //  map.entrySet().stream().filter(entry ->entry.getValue()>1).forEach(System.out::println);

        map.forEach((key,value)->{
            if (value>1){
                System.out.println(key);
            }
        });
    }

}
