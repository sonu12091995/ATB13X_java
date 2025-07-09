package Exception.Checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_Exception {
    public static void main(String[] args) {



        //  Checked exception
        // FileInputStream fileInputStream = new FileInputStream("C://a.txt");
        // Handle exception
        System.out.println("Starting");

        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End");

    }
}
