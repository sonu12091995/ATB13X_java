package Task_Question;

import java.util.Scanner;




public class Atm_Widrowal {
    public static void main(String[] args) {
/*Steps to Write the Program
1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
2️⃣ Take user input for the amount they want to withdraw.
3️⃣ Check withdrawal conditions:
The amount should be greater than zero.
The amount should be a multiple of 100 (common ATM rule).
The amount should not exceed the account balance.
4️⃣ Deduct the amount from the balance if conditions are met.*/


        double balance = 10000.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to withdraw:");

        double amount = sc.nextDouble();

        if (amount > 0 && amount % 100 == 0 && amount <= balance) {

            balance -= amount;

            System.out.println("Withdrawal successful. New balance: ₹" + balance);

        } else {

            System.out.println("Invalid withdrawal. Check amount or balance.");

        }

        sc.close();

    }
}
