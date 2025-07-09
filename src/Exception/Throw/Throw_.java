package Exception.Throw;

public class Throw_ {
    public static void main(String[] args) {

    }
    static void divideByZero(int a ){
        if(a ==0){
            throw new ArithmeticException("Error a == 0");
        }
    }
}
