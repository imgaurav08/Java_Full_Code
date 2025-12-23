package ExceptionHandling;

public class Demo {
    public static void main(String[] args) {
        System.out.println(" hello");
        try {
            System.out.println(10/2); // risky code
        } catch (ArithmeticException e) {
            System.out.println(10/0);
        }
        System.out.println("Byee");
    }
}
