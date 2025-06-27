package Array_1_D;

public class CLI_Argument_ {
    public static void main(String[] args) {
        // Create main method
        // First pass the CLI argument
        // Write the for loop

        for (int i=0; i< args.length; i++)
        {
            System.out.println(args[i]);
        }


        for (Object o : args)
        {
            System.out.println(o);
        }

    }
}
