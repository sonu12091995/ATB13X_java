package Block.IIB_Block;
class IIBExample {

    // IIB - Instance Initialization Block
    {
        System.out.println("Inside IIB block");
        m1();
        m2();
    }

    public void m1() {
        System.out.println("This is m1 method");
    }

    public void m2() {
        System.out.println("This is m2 method");
    }

    // Constructor
    IIBExample() {
        System.out.println("Constructor called");
    }
    }
public class call_method_under_IIB {
    public static void main(String[] args) {
        IIBExample obj  = new IIBExample();

    }
}
