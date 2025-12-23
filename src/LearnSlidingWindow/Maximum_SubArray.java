package LearnSlidingWindow;

public class Maximum_SubArray {
    public static void main(String[] args) {
 int [] arr ={5,4,-1,7,8};
        System.out.println(max(arr));
    }

//    public static int max(int [] nums){
//        int sum=0;
//        int max_sum=nums[0];
//        for (int temp : nums){
//            sum+=temp;
//            if (sum >max_sum){
//                max_sum=sum;
//            }
//            if (sum <0){
//                sum=0;
//            }
//        }
//        return max_sum;
//
//    }


    public static int max(int [] nums){
        int sum=0;
        int max_sum = nums[0];
        for (int temp : nums){
            sum+=temp;
            if (sum > max_sum){
                max_sum=sum;
            }
            if (sum <0){
                sum=0;
            }
        }
        return max_sum;
    }
}
