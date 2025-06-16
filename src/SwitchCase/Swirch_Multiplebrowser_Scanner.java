package SwitchCase;

import java.util.Scanner;

public class Swirch_Multiplebrowser_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value 1 to 7:");
        String browser = scanner.next();
          browser = browser.toLowerCase();//Using remove case-sensitive problem

        switch (browser){

            case "chrome":
                System.out.println("Enter the chrome browser"); break;

            case "firefox":
                System.out.println("Enter the firefox browser"); break;

            case "edge":
                System.out.println("Enter the edge browser"); break;
            default:
                System.out.println("Enter the correct browser"); break;



        }

    }
}
