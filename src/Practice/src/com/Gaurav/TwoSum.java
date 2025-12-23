package Practice.src.com.Gaurav;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int num[] = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(num, target)));

	}

	public static int[] twoSum(int num[], int target) {
           Map<Integer,Integer> map = new HashMap<>();
		   for (int i=0; i < num.length; i++){
			   int a = target -num[i];
			   if (map.containsKey(a)){
				   System.out.println(" Get value " + map.get(a));
				   return  new int[] {i,map.get(a)};

			   }
			   map.put(num[i],i);
		   }
		   return  null;
	}
}