package Task_Question;

import java.util.Random;
import java.util.Scanner;

public class Guessing_number {
    public static void main(String[] args) {

        Random random = new Random();
        int guessNumber = random.nextInt(100)+1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the guessing number");

        int guess;
        int attempt = 0;

        while(true)
        {
            guess=scanner.nextInt();
            attempt++;


            if (guess<guessNumber)
            {
                System.out.println("Too low try again");
            } else if (guess>guessNumber) {
                System.out.println("Too high try again");
            } else {
                System.out.println("Congrats ! number are matching"   +attempt);
                break;
            }
        }

    }
}
