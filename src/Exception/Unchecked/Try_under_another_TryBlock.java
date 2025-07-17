package Exception.Unchecked;

public class Try_under_another_TryBlock {
    public static void main(String[] args) {
        try{
            int a= 100/0;
            System.out.println(a);
            try{
                int [] b = new int [3];
                System.out.println(b[5]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }

        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
