package Task_Question;

import java.util.Scanner;

public class Find_Trangle {
    public static void main(String[] args) {

        /*
        Write a program that classifies a triangle based on its side lengths.
        Given three input values representing the lengths of the sides,
         determine if the triangle is equilateral (all sides are equal),
          isosceles (exactly two sides are equal), or scalene (no sides are equal).
           Use an if-else statement to
           classify the triangle using

         */

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the trangle A value");
        int a =   scanner.nextInt();

        System.out.println("Enter the trangle B value");
        int b =   scanner.nextInt();

        System.out.println("Enter the trangle c value");
        int c =   scanner.nextInt();*/


        int a = 3;
        int b = 4;
        int c = 5;

        // check its trangle or not

        if (a+b>c && b+c > a && c+a>b)
        {
          if (a==b && b==c)
          {
              System.out.println("This is the equilateral trangle  ");
          } else if (a==b || b==c || c==a) {
              System.out.println("This is the isosceles trangle ");
          }else {

              System.out.println(" This is scalane trangle");
          }

        }else {
            System.out.println("this is not trangle");
        }
    }
}
