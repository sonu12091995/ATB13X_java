package oops_polymorphism.Overriding;
// Real automation we have use in the launching the browser

class commonToAll{
    void openBrowser(){
        System.out.println("Open the IE browser");
    }
}

class chrome{
  void openBrowser(){
        System.out.println("Open the Chrome Browser");
    }
}
class fireFox{

    void openBrowser(){
        System.out.println("Open the fireFox Browser");
    }
}
public class RealAutomation {
    public static void main(String[] args) {
        commonToAll c1 = new commonToAll();
        c1.openBrowser();// Id browser launch

        fireFox f1 = new fireFox();
        f1.openBrowser(); // firefox launch

        chrome ch = new chrome();
        ch.openBrowser();// chrome launch

/*

        // Dynamic Dispatch
        commonToAll c2 = new chrome();  like webDriver driver = new ChromeDriver
        c2.openBrowser(); // chrome launch

        commonToAll c3 = new fireFox();
        c3.openBrowser(); // firefox launch


        // Firefox ff = new ChromeTC(); Not relation
*/




    }
}
