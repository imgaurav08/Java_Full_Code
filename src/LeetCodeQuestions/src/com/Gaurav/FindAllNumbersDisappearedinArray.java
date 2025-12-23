package LeetCodeQuestions.src.com.Gaurav;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinArray {

	public static void main(String[] args) {
		int [] nums= {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
		

	}

	public static List<Integer> findDisappearedNumbers(int[] arr) {
	  int i=0;
	  while (i<arr.length){
		  int correct = arr[i]-1;
		  if (arr[i]!= arr[correct]){
			  swap(arr,i,correct);
		  } else {
			  i++;
		  }

	  }

	  List<Integer> list = new ArrayList<>();
	  for (int index =0; index <arr.length;index++){
            if (arr[index]!=index+1){
				list.add(index+1 );
			}

	  }
return list;
	}

	public static void swap(int [] arr, int first, int second){
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
	
}
