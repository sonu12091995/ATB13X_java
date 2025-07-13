package Block.Static_Block;

class p {
    static int a = 10;


    static {

    }
}
public class Static_Variable {
    public static void main(String[] args) {
        p p1= new p();// Don't need pi reference until chnage the value
        System.out.println(p.a);//10

        // Pi change the value
        p1.a=12;
        System.out.println(p1.a);//12
    }
}
