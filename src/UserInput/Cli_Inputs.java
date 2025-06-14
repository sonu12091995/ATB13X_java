package UserInput;

public class Cli_Inputs {
    public static void main(String[] args) {


        int age = 40;

        String CanIvote = (age>18)? "vote" : "No";
        System.out.println(CanIvote);
    }
}
