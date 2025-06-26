package String_Methods;

public class Program_write {
    public static void main(String[] args) {

        /*Write a Java program that demonstrates basic string operations including concatenation,
         length, substring, and character extraction.*/
        //Length: 11, First char: H, Substring: World

        String s= "Hello ";
        s=s.concat("World");
        System.out.println(s);
        //LENGTH
        System.out.println(s.length());//11
        // character

       char ch = s.charAt(0);
        System.out.println(ch);//H

       String s2 =  s.substring(6);
        System.out.println(s2);// world

        // Programe -2
        /*Create a program that demonstrates different ways to compare strings in Java,
         including == operator, equals(), equalsIgnoreCase(), and compareTo() methods.

  Input:
String1: "Hello", String2: "hello", String3: "Hello"
Output:
equals(): false, equalsIgnoreCase(): true, compareTo(): -32
         */

        String p  = "Hello";
        String p1  = "hello";
        String p2  = "Hello";
        System.out.println(p1==p1);// false
        System.out.println(p1==p2);//true
        System.out.println(p.equals(p1));// false
        System.out.println(p1.equalsIgnoreCase(p2)); //true
        System.out.println(p2.compareTo(p1));//-32


        /*
        * programe-3
        *Write a program that demonstrates the performance difference between String concatenation,
        *  StringBuilder, and StringBuffer for multiple string operations.
        *Input:
         1000 iterations
         Output:
          String: 150ms, StringBuilder: 5ms, StringBuffer: 8ms
        * */
        int iterations = 1000;

        // Test String
        long start1 = System.currentTimeMillis();
        String s1 = "";
        for (int i = 0; i < iterations; i++) {
            s1 += i;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("String: " + (end1 - start1) + "ms");

        // Test StringBuilder
        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end2 - start2) + "ms");

        // Test StringBuffer
        long start3 = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(i);
        }
        long end3 = System.currentTimeMillis();

    }
}
