package Block.Static_Block;
class StaticBlock{

     public void m1(){
        System.out.println("This is the m1 method");
    }
    public void m2(){
        System.out.println("This is the m2 method");
    }
   public void m3(){
        System.out.println("This is the m1 method");
    }


    // Static block call method
    static {
        // Create object to call non-static methods
        StaticBlock obj = new StaticBlock();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
public class Call_Method_Under_Static_Block {
    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();

    }

}
