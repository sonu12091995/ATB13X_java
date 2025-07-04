package Super_key;

import java.sql.SQLOutput;

class honda{
    honda(int a){
        System.out.println("Parent class constructor" +a);
    }

}
class Suzuki extends honda{
    Suzuki(int a ){
       super(12);
    }

}
public class Super_with_Parameterized_Constructor {
    public static void main(String[] args) {
        Suzuki su = new Suzuki(23);

    }

}
