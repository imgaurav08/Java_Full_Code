package InterviewQuestions;

import java.util.Arrays;

public class Pivot {
    public static void main(String[] args) {
    int [] arr={1,7,3,6,5,6};
        System.out.println(sum(arr));
    }

    public static int sum(int [] arr){
        int right_sum = Arrays.stream(arr).sum();
        int left_sum=0;
        for (int i=0;i<arr.length;i++){
            right_sum=right_sum-arr[i];
            if (left_sum==right_sum){
                return i;
            }
            left_sum=left_sum+arr[i];
        }
        return -1;
    }

}
