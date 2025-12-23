package LearnSlidingWindow;

import java.util.*;

public class First_Negative_Number_In_Window {
    public static void main(String[] args) {
 int [] arr = {-8, 2, 3, -6, 10};
 int size =2;
        System.out.println(FirstNegativeInteger(arr,size));
    }

    public static List<Integer> FirstNegativeInteger(int arr[], int k) {
        List<Integer> ls=new ArrayList<>();

        int n=arr.length;
        int left=0;
        int right=0;
        Deque<Integer> deque = new LinkedList<>();

        while (right < n) {
            if (arr[right] < 0) {
                deque.addLast(arr[right]);
            }
            if (right - left + 1 == k) {
                if (!deque.isEmpty()) {
                    ls.add(deque.peekFirst());
                } else {
                    ls.add(0);
                }
                if (!deque.isEmpty() && deque.peekFirst() == arr[left]) {
                    deque.pollFirst();
                }

                left++; // Slide window
            }

            right++;
        }
        return ls;
    }
    


}
