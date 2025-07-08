package Static;

class c{
    static int a = 10;

    // When Ever class is loaded static block is exocute
    static {
        System.out.println("This is the called, Static block");

      // Uses called excel collection, Webdriver collection

    }
}
public class Static_block {
    public static void main(String[] args) {
        c c1= new c();//This is the called, Static block
        System.out.println(c.a);//10

    }
}
