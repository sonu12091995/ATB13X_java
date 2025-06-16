package UserInput;

import java.util.Scanner;

public class Scanner_ProblamStatement {

    public static void main(String[] args) {
/*
        Write a program that classifies a triangle based on its side lengths.
         Given three input values representing the lengths of the sides,
         determine if the triangle is equilateral (all sides are equal),
         isosceles (exactly two sides are equal), or scalene (no sides are equal).
          Use an if-else statement to classify the triangle
*/


        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        int a = scanner.nextInt();
        System.out.print("Enter side b: ");
        int b = scanner.nextInt();
        System.out.print("Enter side c: ");
        int c = scanner.nextInt();

        // Check for valid triangle first
        if (a + b > c && a + c > b && b + c > a) {
            // Classification
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Not a valid triangle");
        }
    }
}
