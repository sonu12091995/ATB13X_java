package Task_Question;

public class Reverse_string_palindrome {
    public static void main(String[] args) {

        String s = "Race";
        String rev = " ";

        for (int i = s.length()-1; i>+0; i--)
        {
            rev = rev + s.charAt(i);
        }
        System.out.println("This is the reverse string " +rev);
        // Check this the palindrome
        boolean b = s.equals(rev);
        if (b == true)
        {
            System.out.println("This is the palindrome");
        }else {
            System.out.println("This is not palindrome");
        }

    }
}
