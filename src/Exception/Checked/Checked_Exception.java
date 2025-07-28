package Exception.Checked;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_Exception {
    public static void main(String[] args) throws Exception {



        //  Checked exception
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Documents\\Automation\\filename.xlsx");
        }catch (Exception e){
            System.out.println("FIle is not found please add correct path");
        }

    }
}
