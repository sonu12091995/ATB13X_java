package Leteral;

public class Char_literal {
    public static void main(String[] args) {


        // Char literal
        char a = 'A';
        char digit = '5';
        char symbol = '$';
        char space = ' ';


        //Escape
        char newline = '\n';
        char tab = '\t';
        char quote = '\'';
        char backslash = '\\';

        String example = "Hello\nWorld\t!";


        // Print characters individually
        System.out.println("Newline character: [" + newline + "]");
        System.out.println("Tab character: [" + tab + "]");
        System.out.println("Quote character: [" + quote + "]");
        System.out.println("Backslash character: [" + backslash + "]");

        // Using escape literals in a String
        String example1 = "Hello\nWorld\t!";
        System.out.println("Formatted String Output:");
        System.out.println(example);

    }
}
