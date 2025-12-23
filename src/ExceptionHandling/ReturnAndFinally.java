package ExceptionHandling;

public class ReturnAndFinally {
    public static void main(String[] args) {
        System.out.println(m1());
    }
 public static int m1(){
        try {
            return 10;
        }catch (Exception e){
            return 20;
        } finally {
            return 30;
        }
 }

}
