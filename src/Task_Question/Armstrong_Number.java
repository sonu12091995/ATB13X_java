package Task_Question;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
       // xyz is Armstrong if: x³ + y³ + z³ = xyz)
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int num = scanner.nextInt();*/

        int num = 153;

        int original = num;
        int result = 0;

        while (num > 0) {
            int digit = num % 10;
            result += digit * digit * digit;
            num = num / 10;
        }

        if (original == result) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

       // scanner.close();
    }
    }

