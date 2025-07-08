package Wrapper_classes;

public class Coversion_all {
    public static void main(String[] args) {
        String num  = "10";
        // String -> Wrapper
        Integer a  = Integer.parseInt(num);
        Integer b = Integer.valueOf(num);

        // String to Primitive
        int aa = Integer.parseInt(num);

        // String to Wrapper


        // Wrapper to String (toString method)
        System.out.println(a.toString());

        // Primitive to String
        int age = 10;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString()); // "10"
    }
}

