package LeetCodeQuestions.ArraysQuestions;

public class FindPeakElement {
    public static void main(String[] args) {
       int [] arr ={3,4,3,2,1};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int[] nums) {
        int start=0;
        int end =nums.length-1;
       if (nums.length==0 || nums[0] >nums[1]){
           return 0;
       }
       if (nums[end] > nums[end-1]){
           return end;
       }

       while (start<=end){
           int mid = start + (end-start)/2;
           if (0 < nums[mid] && nums[mid] <nums.length){
               if (nums[mid-1] < nums[mid] &&  nums[mid]>nums[mid+1] ){
                   return mid;
               }
               if ( nums[mid-1] < nums[mid]){
                   start=mid+1;
               }else {
                   end=mid-1;
               }
           }

       }
return -1;
    }
}
