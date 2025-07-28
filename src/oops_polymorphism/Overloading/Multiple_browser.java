package oops_polymorphism.Overloading;


class Browser1{
// No-arg method
void startBrowser() {
    System.out.println("Default browser");
}

// Overloaded method with two parameters
String startBrowser(String browser2, String browser3) {
    System.out.println("Two-arg method: " + browser2 + " and " + browser3);
    return browser2;
}

// Overloaded method with one parameter
String startBrowser(String browser4) {
    System.out.println("One-arg method: " + browser4);
    return browser4;
}
}

public class Multiple_browser {
    public static void main(String[] args) {
        Browser1 br = new Browser1();
        br.startBrowser("chromwe"," OperaMinui");
        br.startBrowser("firefox");
        br.startBrowser();// default browser


    }
}
