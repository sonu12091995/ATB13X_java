package Opps_Abstract;

abstract class Engine{

    abstract void stratEngine();
    abstract void stopEngine();
    abstract void checkEngine();
}
//implements all abstract method and call under the drive method
class gear extends Engine{
     void stratEngine(){
        System.out.println("Strat the engine");
    }
     void stopEngine(){
        System.out.println("Stop the engine");
    }
     void checkEngine(){
         System.out.println("check the engine");
    }

    void drive(){
        stratEngine();
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
