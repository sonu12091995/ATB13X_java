package TypeCasting;

public class upCasting {
    public static void main(String[] args) {

        byte b = 10;// byte is 1 byte

        int i = b;// Implicit Upcasting from byte to int (4 bytes)

        System.out.println("Byte value: " + b);
        System.out.println("Upcasted to int: " + i);



        //int i = (int)b; Explicit upcasting


    }
}
