package Task_Question;

import java.util.Scanner;

public class Grade_calculator {
    public static void main(String[] args) {
        /*Write a program that calculates and displays the letter grade for a given
        numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

     A: 90-100

     B: 80-89

     C: 70-79

     D: 60-69

      F: 0-59*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the score 0 to 100");
        int score = scanner.nextInt();

        if (score<0 || score >100)
        {
            System.out.println("Invalid score ! please enter the (0 to 100)");
        }else if (score>=90){
            System.out.println("Grade: A");

        } else if (score>=80) {
            System.out.println("Grade: B");

        } else if (score>=70) {
            System.out.println("Grade: c");

        } else if (score>=60) {
            System.out.println("Grade: D");

        }else {
            System.out.println("Grade: F");
        }


    }

}
