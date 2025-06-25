package Task_Question;

public class CheckPtime_35 {

    public static void main(String[] args) {
        int number = 35;  // You can change this to test other numbers
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        }

        // Check if divisible by any number from 2 to number-1
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }
    }
}

