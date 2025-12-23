package LearnRecursion;

public class LinearSearch {
    public static void main(String[] args) {
int [] arr ={3,46,2,6,7,1};
        System.out.println(search(arr,311,0));
    }

    public static int search(int [] arr , int target, int index){
        if (index==arr.length){
            return -1;
        }
        if (arr[index]== target){
            return index;
        }
        else {
            return search(arr, target, index+1);
        }
    }
}
