package Task_27;

import java.util.Scanner;

public class Divisible_by_5_and_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's divisible by 5 or 11: ");
        double number = sc.nextDouble();

        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println(" The number is divisible by both 5 and 11: " + number);
        } else if (number % 5 == 0) {
            System.out.println(" The number is divisible by 5: " + number);
        } else if (number % 11 == 0) {
            System.out.println("The number is divisible by 11: " + number);
        } else {
            System.out.println(" The number is not divisible by 5 or 11.");
        }
    }
}
