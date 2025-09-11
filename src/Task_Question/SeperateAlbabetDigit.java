package Task_Question;

public class SeperateAlbabetDigit {
    public static void main(String[] args) {
        String input = "abc123xyz456";

        String letters = "";
        String digits = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                letters = letters + c;   // append character
            } else if (Character.isDigit(c)) {
                digits = digits + c;     // append digit
            }
        }

        System.out.println("Characters: " + letters);
        System.out.println("Digits: " + digits);
    }
    }

