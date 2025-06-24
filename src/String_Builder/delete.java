package String_Builder;

public class delete {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello Java");
        sb.delete(1,5);
        System.out.println(sb);//H Java

    }
}
