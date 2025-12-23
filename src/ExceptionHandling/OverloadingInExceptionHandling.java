package ExceptionHandling;

import java.io.IOException;

public class OverloadingInExceptionHandling {

}

//Super class
class Test{
    public  void display() throws RuntimeException{
        System.out.println("Parent class");
    }
}

//child class
class Test1 extends  Test {
    @Override
    public void display()    {
    }
}

