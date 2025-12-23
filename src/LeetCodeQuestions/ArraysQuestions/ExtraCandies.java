package LeetCodeQuestions.ArraysQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class ExtraCandies {
    public static void main(String[] args) {
    int [] arr = {2,8,7}; //{2,3,5,1,3};
    int candy =1;
    System.out.println(Arrays.toString(new List[]{kidsWithCandies(arr, candy)}));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        if (candies.length!=0){
          int max = Arrays.stream(candies).max().getAsInt();
            for (int candy : candies) {
                int temp = candy + extraCandies;
                if (temp >= max) {
                    list.add(true);
                } else {
                    list.add(false);
                }
            }
        }
        return list;
          }
    }

