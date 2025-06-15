package UserInput;

public class Cli_Inputs {
    public static void main(String[] args) {


        String s = args[0];
        int age = Integer.parseInt(s);

        String CanIvote = (age>18)? "vote" : "No";
        System.out.println(CanIvote);
    }
}
