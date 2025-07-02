package oops_inheritence.Multilavel_inheritence;

public class Main_class_Runner {
    public static void main(String[] args) {

        // Access only own method
        GrandFather gr = new GrandFather();
        gr.gf();
        gr.home();

        // Access own and Gf method
        Fathher fa=new Fathher();
        fa.f();
        fa.home();
        fa.gf();


        // Son access everythong
        Son s1 = new Son();
        s1.s();
        s1.f();
        s1.home();
        s1.gf();


    }

}
