package oops_inheritence.Herical_inheritence;

class Father{
    void home(){
        System.out.println("3BHK");
    }
}

class Pramod extends Father{
    void h2(){
        System.out.println("h2 - Pramod");
    }
}

class Lucky extends Father{

    void l2(){
        System.out.println("Lucky");
    }

    void r1(){
        System.out.println("Juhani sharma");
    }
}

class Ruhani extends Father {
    void r1(int a){
        System.out.println("ruhani");
    }
}
public class Herarical {
    public static void main(String[] args) {

        Ruhani l = new Ruhani();
        l.r1(12);
        l.home();

        // Dynamic dispatch
        Lucky lucky = new Lucky();
        lucky.l2();// own method

    }
}
