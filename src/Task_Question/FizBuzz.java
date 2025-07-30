package Task_Question;

/*Write a program that prints numbers from 1 to 100.
However, for multiples of 3, print "Fizz" instead of the number,
and for multiples of 5, print "Buzz."
For numbers that are multiples of both 3 and 5, print "FizzBuzz."*/


public class FizBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Check for multiples of both 3 and 5 first
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check for multiple of 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check for multiple of 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Not a multiple of 3 or 5
            else {
                System.out.println(i);
            }
        }
    }


}
