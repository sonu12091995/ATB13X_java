package Task_Question;

import javax.naming.spi.DirObjectFactory;
import java.util.Scanner;

public class Eligible_for_Loan {
    public static void main(String[] args) {
        /*Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)

    * Take the below User info and store it into the variables:
              Age (integer)
              Salary (double or float)
              Credit Score (integer)
    Age Validation:
              :- Check if the age is a positive integer.
              :- Ensure the age is at least 18 years old.
              :- Max age can be 80.
    Salary Validation:
             :- Check if the salary is a positive number.
             :- Define a minimum salary threshold (e.g., 30,000).
    Credit Score Validation:
             :- Check if the credit score is a positive integer.
             :- Define a minimum credit score threshold (e.g., 650).
             :- Max credit score threshold (e.g., 850).

*/
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:  18 to 80");
        int age  = sc.nextInt();

        System.out.println("Enter the Salary Minimum 30,000");
        double salary  = sc.nextDouble();

        System.out.println("Enter the score between 650 to 850");
        int score  = sc.nextInt();

        /*int age = 18;
        double salary = 10000;
        int score = 90;*/

        if (age>=18 && age<=80)
        {
            System.out.println("Eligible for the loans" +age);
        } else if (salary>=30000)
        {
            System.out.println("Eligible for the loans" +salary);
        } else if (score>=650 && score<=850)
        {
            System.out.println("Eligible for the loans" +score);

        } else  {
            System.out.println("Invalid data Entered");

        }


        // Second type
        // Validate all conditions
        /*if ((age >= 18 && age <= 80) &&
                (salary >= 30000) &&
                (score >= 650 && score <= 850)) {

            System.out.println("✅ Eligible for the loan.");
        } else {
            System.out.println("❌ Not eligible for the loan. Please check your details.");
        }

        sc.close();
*/


    }
}
