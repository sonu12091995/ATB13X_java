package Task_Question;

import java.util.Scanner;

public class Vote_eligible {
    public static void main(String[] args) {
        //Check if a Person is Eligible to Vote (Age Check).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Vote age");
        int a = scanner.nextInt();


        String number = (a>=18)?  "Eligible" : " Not Eligible";
        System.out.println(number);


        //second type

        int age_Person = 18;
        if (age_Person>=18)
        {
            System.out.println("Eligible" +age_Person);
        }else
        {
            System.out.println("Not Eligible" +age_Person);
        }

    }
    }