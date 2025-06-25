package Array_Task;

public class Boolean_Array {
    public static void main(String[] args) {
        boolean[] flags = {true, false, true, true};

        for (boolean flag : flags) {
            System.out.println(flag);
        }

        // second way
        boolean b[] = new boolean[3];
        b[0] = true;
        b[1] = false;
        b[2] = true;
        System.out.println(b[0]);
        System.out.println(b[1]);

    }
}
