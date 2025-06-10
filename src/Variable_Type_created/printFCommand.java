package Variable_Type_created;

public class printFCommand {
    public static void main(String[] args) {
        //print the ouput pn the format

        int num1 = 3;
        System.out.printf("%d * 5 = %d%n", num1, num1 * 5);


        // Use printF command write 9 table

        int num = 9;
        System.out.printf("%d × 1 = %d%n", num, num * 1);
        System.out.printf("%d × 2 = %d%n", num, num * 2);
        System.out.printf("%d × 3 = %d%n", num, num * 3);
        System.out.printf("%d × 4 = %d%n", num, num * 4);
        System.out.printf("%d × 5 = %d%n", num, num * 5);
        System.out.printf("%d × 6 = %d%n", num, num * 6);
        System.out.printf("%d × 7 = %d%n", num, num * 7);
        System.out.printf("%d × 8 = %d%n", num, num * 8);
        System.out.printf("%d × 9 = %d%n", num, num * 9);
        System.out.printf("%d × 10 = %d%n", num, num * 10);


        // Write looping statement write table

        int num2 = 9;
        for (int i = 1; i<=10; i++)
        {
            System.out.println(num2+"*"+i+"+"+(num2*1));
        }
    }


    }

