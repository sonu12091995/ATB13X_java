package oops_inheritence.Multilavel_inheritence;

public class Dynamic_Dispatch {
    public static void main(String[] args) {

        // Gf can access the own function and common function (home function common son father also)
        GrandFather g = new Son();
        g.home();// common method own and sone=
        g.gf();// own method


        // Father can access own and grandfather function and son common function(home is common)
        Fathher fe = new Son();
        fe.gf();// grandfather method
        fe.f();// Father own method
        fe.home();// common method father and som

        // GrandFather can access own and grandfather function and common function(home is common)

        GrandFather ge = new Fathher();
        ge.gf();// grandfather method
        ge.home(); // common method father and grandfather
        ge.home1();//common method father and grandfather


    }
}
