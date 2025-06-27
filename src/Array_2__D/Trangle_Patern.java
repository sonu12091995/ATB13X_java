package Array_2__D;

public class Trangle_Patern {
    public static void main(String[] args) {
        int rows = 10;

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k= 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }

}
