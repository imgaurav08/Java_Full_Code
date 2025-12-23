package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyWord {
    public static void main(String[] args) throws FileNotFoundException {
  fileRead();
    }

    public static void fileRead() throws FileNotFoundException {
        FileReader fileReader = new FileReader("test.txt");
        // code
    }
    
}
