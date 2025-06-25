package Array_Task;

import java.util.Scanner;

public class Array_scanner_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array(int) only");
        int size =  sc.nextInt();


        int[] numbers_marks =  new int[size];

        //        float[] numbers_marks =  new float[size];
        // String[] numbers_marks =  new String[size];


        for (int i = 0; i < numbers_marks.length ; i++) {
            System.out.println("Enter the numbers");
            numbers_marks[i] = sc.nextInt();
        }

        System.out.println(" ---- Below Code is printing the elements! ");

        for (int i = 0; i < numbers_marks.length ; i++) {
            System.out.println(numbers_marks[i]);
        }
    }
}
