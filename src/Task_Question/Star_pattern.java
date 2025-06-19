package Task_Question;

public class Star_pattern {
    public static void main(String[] args) {

        int star=5;
        for (int i =1; i<=star; i++){
            for (int j=1; j<=i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
