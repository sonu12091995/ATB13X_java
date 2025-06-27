package Task_Question;

import java.util.Scanner;

public class Bonus_Based_on_Salary {
    public static void main(String[] args) {
       /* Define the bonus structure based on salary and years of experience.
           :- If years of experience is less than 1 year: No bonus.
           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.*/



     Scanner sc = new Scanner(System.in);

        // Input salary
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        // Input experience
        System.out.print("Enter your years of experience: ");
        int exp = sc.nextInt();

        double bonus = 0;

        // Bonus logic
        if (exp < 1) {
            System.out.println("❌ No bonus for experience less than 1 year.");
        } else if (exp >= 1 && exp <= 3) {
            bonus = salary * 0.05;
            System.out.printf("✅ Bonus is 5%% of salary: ₹%.2f%n", bonus);
        } else if (exp >= 4 && exp <= 6) {
            bonus = salary * 0.10;
            System.out.printf("✅ Bonus is 10%% of salary: ₹%.2f%n", bonus);
        } else if (exp > 6) {
            bonus = salary * 0.15;
            System.out.printf("✅ Bonus is 15%% of salary: ₹%.2f%n", bonus);
        }


        sc.close();
    }
}
