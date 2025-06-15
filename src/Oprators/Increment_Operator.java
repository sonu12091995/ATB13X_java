package Oprators;

public class Increment_Operator {
    public static void main(String[] args) {

        int a = 10;
        int b = ++a;
        System.out.println(a);//11
        System.out.println(b);//11


        int c= 10;
        System.out.println(++a);//11
        System.out.println(a);//11

        //Post increment

   int post = 10;
        System.out.println(post++); //10
        System.out.println(post);//11
        System.out.println(post++);//11
        System.out.println(post);//12


        int k = 10;
        int res = a++;
        System.out.println(a); //11
        System.out.println(res);//10
    }
}
