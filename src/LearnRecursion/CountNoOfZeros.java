package LearnRecursion;

public class CountNoOfZeros {
    public static void main(String[] args) {
        System.out.println(count(12030000));
    }

    public static int count(int num){
        return calculate(num,0);
    }

public static int calculate(int num,int c){
        if (num==0){
            return c;
        }

        int rem = num%10;
        /*if (rem==0){
            return calculate(num/10,c+1);
        }else {
            return calculate(num/10,c);
        }*/

    return c=rem==0?calculate(num/10,c+1):calculate(num/10,c);
}
}
