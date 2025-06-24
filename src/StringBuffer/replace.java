package StringBuffer;

public class replace {
    public static void main(String[] args) {


        StringBuffer sb = new StringBuffer("Hello World");
        sb.replace(6, 11, "Java");
        System.out.println(sb); // Output: Hello Java

    }
}
