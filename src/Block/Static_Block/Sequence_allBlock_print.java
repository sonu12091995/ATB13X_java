package Block.Static_Block;

class sonu {

static {
    System.out.println("This si the static block");

    //Under the block can't create method

   /* void test(){
        System.out.println("This si the test block");

    }*/
}

       {
           System.out.println("This si the  block- 1");

       }
    {
        System.out.println("This si the  block- 2");

    }

       String name= "Sonu"; // variable out side the block


      void test(){ // Method out side the block
        System.out.println("This si the test block");

    }
   }

public class Sequence_allBlock_print {

    public static void main(String[] args) {
        sonu s = new sonu();//Always first print static block then IIB block
        System.out.println(s.name);
        s.test();
    }
}
