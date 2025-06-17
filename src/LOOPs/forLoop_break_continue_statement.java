package LOOPs;

public class forLoop_break_continue_statement {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // loop exits when i is 5
            }
            System.out.println("Break Loop Value: " + i);
        }


        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // skips when i is 5
            }
            System.out.println("Continue Loop Value: " + i);
        }
    }
}
