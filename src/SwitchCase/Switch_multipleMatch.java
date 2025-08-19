package SwitchCase;

public class Switch_multipleMatch {

    public static void main(String[] args) {

        int code = 1; // better: avoid leading 0

        switch (code) {
            case 1, 2, 3 -> System.out.println("Low priority code");
            case 4, 5 -> System.out.println("Medium priority code");
            case 6, 7, 8, 9 -> System.out.println("High priority code");
            default -> System.out.println("Invalid code");
        }
    }
}
