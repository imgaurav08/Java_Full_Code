package Practice.src.com.Gaurav;

public class PivotIndex {
        public static void main(String[] args) {
            int[] nums = {1, 7, 3, 6, 5, 6};
            int pivotIndex = findPivotIndex(nums);
            System.out.println("Pivot Index: " + pivotIndex);
        }

        public static int findPivotIndex(int[] nums) {
            int totalSum = 0;
            for (int num : nums) {
                totalSum += num;
            }

            int leftSum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (2*leftSum + nums[i] == totalSum  ) {
                    return i;
                }
                leftSum += nums[i];
            }

            return -1;
        }


}
