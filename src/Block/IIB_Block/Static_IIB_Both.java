package Block.IIB_Block;
class A1{
    A1(){
        System.out.println("DC");
    }

    // Block-1
    {
        System.out.println("Hi, I am IIB");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file

    }
 //block-2
    {
        System.out.println("Hi, I am IIB 2");
    }
  // Block-3
    {
        System.out.println("Hi, I am IIB 3");
    }

    // Static block
    static {
        System.out.println("1 - SIB");
    }


}
public class Static_IIB_Both {
    public static void main(String[] args) {
        A1 a = new A1();/*1 - SIB-- Static block
                        Hi, I am IIB
                       If you want to execute or call something when object is created
                        Hi, I am IIB 2
                       Hi, I am IIB 3
                           DC ----- Constructor */
        A1 a1 = new A1();
    }
}
