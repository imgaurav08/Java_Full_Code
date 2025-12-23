package ExceptionHandling;

public class EgFinallyBlock {
    public static void main(String[] args) {
        System.out.println("Enter in try block");
        try {
            System.out.println(10/2);
        }catch (Exception e){
            System.out.println(" Catch block executed ");
        }finally {
            System.out.println("Finally block executed");
        }
    }
}
