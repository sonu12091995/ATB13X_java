package oops_polymorphism.Overloading;
class Browser{

    void StratBrowser(){// Methodn -1
        System.out.println("Strat Browser default");
    }

    String StratBrowser(String browser){ // Method-2
        System.out.println("Start Browser "+ browser);
        return  browser;
    }

}
public class RealAutomation {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        //b1.StratBrowser();// Default browser is launchd
        b1.StratBrowser("chrome");
    }

}
