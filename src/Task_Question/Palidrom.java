package Task_Question;

public class Palidrom {
    public static void main(String[] args) {

        String s = "madam";
        String rev = "";
   for (int i= s.length()-1; i>=0; i--)
   {
       rev = rev+s.charAt(i);
   }
        System.out.println("This is the reverse string" +rev);
    if (s.equalsIgnoreCase(rev))
    {
        System.out.println("This is the palindrome");
    }else {
        System.out.println("This is the Not  palindrome");
    }



    // Second way
        String s1 = "pop";
        String rev1 = "";
        for (int i= s1.length()-1; i>=0; i--)
        {
            rev1= rev1+s1.charAt(i);
        }
        System.out.println("This is the reverse string" +rev1);
      boolean b = s1.equals(rev1);
      if (b==true)
      {
          System.out.println("This is the palindrome");
      }else {
          System.out.println("This is the Not  palindrome");
      }
    }
}
