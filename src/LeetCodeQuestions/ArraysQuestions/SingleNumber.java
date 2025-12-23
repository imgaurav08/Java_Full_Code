package LeetCodeQuestions.ArraysQuestions;

public class SingleNumber {
    public static void main(String[] args) {
int [] arr = {2,2,1};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
     int result =0;
     for (int num : nums){
         result^=num;
     }
     return result;
    }
}
