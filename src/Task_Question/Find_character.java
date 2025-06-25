package Task_Question;

import java.util.Scanner;

public class Find_character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char ch = scanner.next().charAt(0);


        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("This is an alphabet: " + ch);
        } else {
            System.out.println("Invalid input. Not an alphabet.");
        }
        }

    }

