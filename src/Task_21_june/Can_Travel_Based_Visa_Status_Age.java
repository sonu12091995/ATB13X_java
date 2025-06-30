package Task_21_june;

import java.util.Scanner;

public class Can_Travel_Based_Visa_Status_Age {
    public static void main(String[] args) {

        /*take the input from the user for
            Age (integer).
            Visa Status (String or boolean).
         Check Eligibility:
             : If age is 18 or older and visa status is valid, the person can travel.
        Otherwise, the person cannot travel.
        Validation Criteria
               Age: - Must be a non-negative integer.
                    :- Should be greater than or equal to 18 to be eligible to travel.
        Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
         :- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.*/
    // Type -Boolean use
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println(" Invalid input: Age cannot be negative.");
            return;
        }

        System.out.print("Do you have a valid visa? (true/false): ");
        boolean visa = sc.nextBoolean();

        // Eligibility check
        if (age >= 18 && visa == true) {
            System.out.println(" Congratulations! You are eligible to travel.");
        } else {
            System.out.println(" Sorry, you are not eligible to travel.");
        }

        sc.close();




        // String use for valid and invalid
        /*Scanner sc = new Scanner(System.in);

        // Get age input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Validation for age
        if (age < 0) {
            System.out.println(" Invalid input: Age cannot be negative.");
            return;
        }

        // Get visa status input (String)
        System.out.print("Enter your visa status (valid/invalid): ");
        String visa = sc.next().toLowerCase(); // normalize input

        // Validation for visa
        if (!visa.equals("valid") && !visa.equals("invalid")) {
            System.out.println(" Invalid input: Visa status must be 'valid' or 'invalid'.");
            return;
        }

        // Eligibility check
        if (age >= 18 && visa.equals("valid")) {
            System.out.println("You are eligible to travel.");
        } else {
            System.out.println(" You are not eligible to travel.");
        }*/
    }

}
