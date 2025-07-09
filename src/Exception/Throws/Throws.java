package Exception.Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


// Throws use complete the function
public class Throws {

    static void t() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}
