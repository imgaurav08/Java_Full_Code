package ExceptionHandling;

public class ThrowKeyWord {
    public static void main(String[] args) {
        System.out.println(voting(16));
    }

    public static String voting(int age){
        if (age < 18){
              throw  new RuntimeException("Sorry you are not eligible for the vote");
        }
        return " you are eligible for voting";
    }

}


