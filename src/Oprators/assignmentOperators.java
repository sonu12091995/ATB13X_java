package Oprators;

public class assignmentOperators {


        public static void main(String[] args) {
            int a = 10;

            System.out.println("Initial value of a: " + a);

            // Simple assignment
            a = 20;
            System.out.println("a = 20         → a = " + a);

            // Add and assign
            a += 5; // same as a = a + 5
            System.out.println("a += 5         → a = " + a);

            // Subtract and assign
            a -= 3; // same as a = a - 3
            System.out.println("a -= 3         → a = " + a);

            // Multiply and assign
            a *= 2; // same as a = a * 2
            System.out.println("a *= 2         → a = " + a);

            // Divide and assign
            a /= 4; // same as a = a / 4
            System.out.println("a /= 4         → a = " + a);

            // Modulus and assign
            a %= 3; // same as a = a % 3
            System.out.println("a %= 3         → a = " + a);
        }
    }


