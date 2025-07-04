package oops_inheritence.Multilavel_inheritence;

public class Dynamic_Dispatch {
    public static void main(String[] args) {

        // Gf can access the own function and comman function (home function common son father also)
        GrandFather g = new Son();
        g.home();
        g.gf();


        // Father can access own and grandfather function and comman function(home is comman)
        Fathher fe = new Son();
        fe.gf();
        fe.f();
        fe.home();
        // GrandFather can access own and grandfather function and comman function(home is comman)

        GrandFather ge = new Fathher();
        ge.gf();
        ge.home();

    }
}
