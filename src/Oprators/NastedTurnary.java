package Oprators;

public class NastedTurnary {
    public static void main(String[] args) {
        int age = 45; // You can change this value to test

        String category = (age >= 60) ? "Senior" : (age >= 18) ? "Adult" : "Minor";

        System.out.println("Age: " + age + " → " + category);
    }
}
