package Array_1_D;

public class Avrage_Array {
    public static void main(String[] args) {
        // Average--- https://www.programiz.com/online-compiler/2EGE4bB9tk37x

        int[] num = {23, 33, 45};
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }

        // Correct: print sum
        System.out.println("Sum: " + sum);

        // Calculate and print average
        int avg = sum / 3;
        System.out.println("Average: " + avg);
    }
}
