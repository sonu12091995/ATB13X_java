package Oops_interface.Hybird_Inheritence;


// This is archive by two classes and two interface
public class Hybird_inheritence_Run_class extends Class_A implements Interface_A, Interface_B {


    public void m3() {// Abstract Method implement
        System.out.println(" This is the Interface_A Abstract Method");
    }

    public void m4() {// Abstract Method implement
        System.out.println(" This is the Interface_B Abstract Method");
    }

    // Additional method
    public void m5(){
        System.out.println("This is public Additional method");
    }

    public static void main(String[] args) {
        Hybird_inheritence_Run_class ab = new Hybird_inheritence_Run_class();
        System.out.println(Class_A.name);// static clasname.varible
        ab.m1();
        ab.m3();
        ab.m4();

        // Class A object
        Class_A a  = new Class_A();
        System.out.println(Class_A.name);// static clasname.varible
        a.m1();

        // Interface A dynamic dispatcg

        Interface_B b = new Hybird_inheritence_Run_class();


    }
}
