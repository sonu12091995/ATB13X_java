package oops_polymorphism.Overloading;
class Block{

    static{
        Block block = new Block();
        block.staticmethod();
        System.out.println( " Static block");
    }

    public void call(){
        System.out.println("call method");
    }

    public  void staticmethod(){

    }

    {
        System.out.println("IIB Block");
        call();

    }


}
public class Multiple_browser {
    public static void main(String[] args) {
        Block b= new Block();
        b.staticmethod();

        b.call();


    }
}
