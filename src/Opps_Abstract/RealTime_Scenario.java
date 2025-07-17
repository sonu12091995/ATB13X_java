package Opps_Abstract;

abstract class Engine{

    abstract int  stratEngine(int a, int b);
    abstract void stopEngine();
    abstract void checkEngine();
}
//implements all abstract method and call under the drive method
class gear extends Engine{

     int  stratEngine(int a, int b){
        System.out.println("Strat the engine");
        return a+b;
    }
     void stopEngine(){
        System.out.println("Stop the engine");
    }
     void checkEngine(){
         System.out.println("check the engine");
    }

    void drive(){
        stratEngine(12,14);
        stopEngine();
        checkEngine();
    }
}

public class RealTime_Scenario {

    public static void main(String[] args) {
        gear d = new gear();
        d.drive();// everything print under the drive method everything run then call
        // saparate method due to this everything hide
    }
}
