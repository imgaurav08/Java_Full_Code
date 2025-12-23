package LeetCodeQuestions.Maths;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
   static int ans = 0;
    public static int reverse(int x) {


        if (x == 0) {
            return ans;

        }
        int rem = x % 10;
        ans = ans * 10 + rem;
        return reverse(x/10);

    }
}
