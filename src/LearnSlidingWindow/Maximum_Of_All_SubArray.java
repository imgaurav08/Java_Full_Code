package LearnSlidingWindow;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Vector;

public class Maximum_Of_All_SubArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 1, 4, 5};
        int size =3;
        System.out.println(maximum(arr,size));

    }

    public static Vector<Integer> maximum(int [] arr, int size){
        Vector<Integer> vector = new Vector<>();
        Deque<Integer> deque = new LinkedList<>();
        int start =0;
        int end =0;
        while (end<arr.length){
            if (deque.size()==0){
                deque.add(arr[end]);
            }else {
                while (deque.size()>0 && deque.peekLast() < arr[end]){
                    deque.removeLast();
                }
                deque.add(arr[end]);
            }
            if (end - start+1 < size){
                end++;
                continue;
            }
            if (end - start+1 == size){
                vector.add(deque.peek());
                if (arr[start]== deque.peek()){
                    deque.removeFirst();
                }
         end++;
                start++;
            }
        }
        return vector;
    }

}
