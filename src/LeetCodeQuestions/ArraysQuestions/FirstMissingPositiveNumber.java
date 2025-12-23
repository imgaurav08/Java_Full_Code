package LeetCodeQuestions.ArraysQuestions;

public class FirstMissingPositiveNumber {
    public static void main(String[] args) {
int [] arr ={1,2,0};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
  int start=0;
  while (start < nums.length){
      int correctIndex = nums[start]-1;
      if (nums[start] >0 && nums[start]<=nums.length && nums[start]!=nums[correctIndex] ){
          int temp= nums[start];
          nums[start]= nums[correctIndex];
          nums[correctIndex]=temp;
      }else {
          start++;
      }
  }

  for (int index=0;index<nums.length;index++){
      if (nums[index]!=index+1){
          return index+1;
      }
  }
  return nums.length+1;
    }
}
