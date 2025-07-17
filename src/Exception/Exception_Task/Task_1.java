package Exception.Exception_Task;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        /*Task 1: Basic Try-Catch with ArithmeticException
    📘 Description:
    Divide a number by zero and handle the exception.
🧤 Expected Output:
     Catch ArithmeticException and print a friendly message.*/


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
      try {
          int a = 100 / number;
      }catch(ArithmeticException e){
          System.out.println(e.getMessage());
          System.out.println("Please enter the Garter than Zero");
      }
    }

}
