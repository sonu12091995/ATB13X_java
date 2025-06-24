package Task_Question;

public class Prime_number__to_100 {
    public static void main(String[] args) {

        System.out.println("Prime numbers from 1 to 100:");

        // Print 1 to 100 prime number

        for(int num = 2; num<=100; num++ ){
            boolean isPrime = true;

            for (int i=2; i<=num-1; i++){
                if (num%i==0){
                    isPrime = false;
                    break;
                }

            }

            if (isPrime){
                System.out.println(num);
            }




        }
}
}
