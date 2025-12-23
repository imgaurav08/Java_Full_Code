package LearnSlidingWindow;

public class Maximum_Sum_SubArray {
    public static void main(String[] args) {
        int [] arr = {100, 200, 300, 400};
        int size =2;
        System.out.println(maxSum(arr,size));
    }

//    public static int maxSum(int [] arr, int size){
//      int sum=0;
//        int max=0;
//        int start =0; int end=0;
//        while (end <arr.length){
//            sum+=arr[end];
//            if (end-start+1 < size){
//                end++;
//            } else if (end-start+1 == size){
//                max=Math.max(sum,max);
//                sum-=arr[start];
//                start++;
//                end++;
//
//            }
//        }
//        return max;
//    }

    public static int maxSum(int [] arr , int size){
        int max =0; int sum=0;
        int start =0;
        int end =0;
        while(end < arr.length){
            sum+=arr[end];
            if (end-start+1 < size){
                end++;
            } else if (end-start+1 == size){
                max=Math.max(sum,max);
                sum-=arr[start];
                start++;
                end++;
            }
        }

        return max;
    }

}
