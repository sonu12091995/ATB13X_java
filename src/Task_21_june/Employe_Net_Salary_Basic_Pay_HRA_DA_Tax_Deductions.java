package Task_21_june;

import java.util.Scanner;

public class Employe_Net_Salary_Basic_Pay_HRA_DA_Tax_Deductions {
    public static void main(String[] args) {
        /*HRA = 20% of Basic Pay

DA = 10% of Basic Pay

Gross Salary = Basic + HRA + DA

Tax Deduction = 12% of Gross Salary

Net Salary = Gross Salary - Tax*/
        Scanner sc = new Scanner(System.in);

        // Input: Basic Pay
        System.out.print("Enter Basic Pay: ₹");
        double basicPay = sc.nextDouble();

        // Calculate Allowances
        double hra = 0.20 * basicPay;  // 20% HRA
        double da = 0.10 * basicPay;   // 10% DA

        // Gross Salary
        double grossSalary = basicPay + hra + da;

        // Tax Deduction (e.g., 12%)
        double tax = 0.12 * grossSalary;

        // Net Salary
        double netSalary = grossSalary - tax;

        // Output
        System.out.println("---- Salary Breakdown ----");
        System.out.println("Basic Pay     : " + basicPay);
        System.out.println("HRA (20%%)     : " + hra);
        System.out.println("DA (10%%)      : " + da);
        System.out.println("Gross Salary  : " + grossSalary);
        System.out.println("Tax (12%%)     : " + tax);
        System.out.println("Net Salary    : " + netSalary);


    }
}
