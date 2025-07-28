package SIB_IIB_Mix;
class Block {

    // Static block - runs once when the class is loaded
    static {
        Block block = new Block();   // Creates object to access non-static members
        block.staticmethod();        // Call instance method
        System.out.println("Static block");
    }

    // Instance Initialization Block (IIB) - runs every time an object is created
    {
        System.out.println("IIB Block");
        call();
    }

    public void call() {
        System.out.println("call method");
    }

    public void staticmethod() {
        System.out.println("This is misleadingly named staticmethod, but it's not static.");
    }
}

public class SIB_IIB_With_NonStatic_Method {
    public static void main(String[] args) {
        Block b = new Block();  // Triggers IIB
        b.staticmethod();       // Call instance method
        b.call();               // Call another instance method
    }



}
