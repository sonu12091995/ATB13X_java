package oops_Constructor.Default_Constructor;



class Car {  // class
    String name;
    int year;
    String model;

    // DC
    Car(){// constructor
        name = "Unknown Car";
        year = 1991;
        model =  "XXX";
    }

}

public class DefaultValue_Without_Parameter {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.name);
        System.out.println(c.year);
        System.out.println(c.model);/*Unknown Car
                                       1991
                                        XXX*/
    }
}
