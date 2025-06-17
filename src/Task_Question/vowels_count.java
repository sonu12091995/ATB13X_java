package Task_Question;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class vowels_count {
    public static void main(String[] args) {
        String a  = " Selenium with Automation";

        // We can use regular expression vowel present or Not
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = pattern.matcher(a);

        if (matcher.find())
        {
            System.out.println("The vowels are present " );
        }else{
            System.out.println("No vowel found");
        }



        // vowel count

        String total = "Hellow world";

        int count = 0;
        int consonants = 0;
        Pattern pattern1 = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher1 = pattern1.matcher(total);

        while (matcher1.find())
        {
            count++;
        }
        System.out.println(count);


    }
}
