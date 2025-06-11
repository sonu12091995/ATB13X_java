package Oprators;

public class turnaryOprator {
    public static void main(String[] args) {

        int a = 10, b = 20;

        // Example 1: Find the greater number
        int max = (a > b) ? a : b;
        System.out.println("Greater number is: " + max);

        // Example 2: Check even or odd
        int number = 7;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + result);

        // Example 3: Check eligibility to vote
        int age = 18;
        String message = (age >= 18) ? "Eligible to vote" : "Not eligible";
        System.out.println("Age: " + age + " → " + message);
    }
}
