package GFGCoding.ArraysQuestions;


public class SecondLargest {
    public static void main(String[] args) {
       int [] arr = {12, 35, 1, 10, 34, 1};
       int [] temp ={10,10,10};
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
         int firstLargest=-1;
        int secondLargest=-1;
        for (int i=0; i<arr.length;i++){
              if (arr[i] >firstLargest){
                  secondLargest=firstLargest;
                  firstLargest= arr[i];
              } else if(arr[i] < firstLargest && arr[i] > secondLargest) {
                  secondLargest = arr[i];
              }
          }

return secondLargest;
    }
}
