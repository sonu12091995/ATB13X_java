package Task_Question;

public class num_Palindrom {
    public static void main(String[] args) {
        int num = 121;           // Original number to check
        int temp = num;          // Copy of the original number (we will change temp)
        int rev = 0;             // Variable to store the reversed number

        while (temp > 0) {
            int digit = temp % 10;           // Get the last digit of the number
            rev = rev * 10 + digit;          // Append it to the reversed number
            temp = temp / 10;                // Remove the last digit from temp
        }

        if (num == rev) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is NOT a Palindrome.");
        }
    }
}
