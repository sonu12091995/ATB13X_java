package Exception.Exception_Task;
import Exception.Unchecked.ArthmeticExceptio;

import java.lang.ArithmeticException;
public class Task_2 {
    public static void main (String[] args) {
        /* Task 2: Try-Catch with Multiple Catch Blocks
📘 Description:
Write code that may throw either ArithmeticException or ArrayIndexOutOfBoundsException
 and handle them with multiple catch blocks.
🧤 Expected Output:
Print which exception occurred.*/
        try {
            String Exception = args[0];//ArrayIndexOutOfBoundsException:
            int a = Integer.parseInt(Exception);// Using Sonu . NumberFormatException
            int div = 100 / a;// div 0   .ArithmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());

        }





    }
}
