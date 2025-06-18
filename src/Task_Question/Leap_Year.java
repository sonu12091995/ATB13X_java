package Task_Question;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {

       /*
       Create a program that determines whether a given year is a leap year.
       A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
       Use an if-else statement to make this determination. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");


        /* handle String value
        if (!scanner.hasNextInt()){

            System.out.println("Please add the intiger value");
            return;
        }*/

        int year = scanner.nextInt();

        if(year%4==0 && year%100!=0 || (year%400==0))
        {
            System.out.println("This is the leap year");
        }else{
            System.out.println("Its a Normal year");

        }
        System.out.println(year);
    }


    }
