package Task_Question;

public class Upper_lower_count {
    public static void main(String[] args) {

        String s = " This is the automation code";

        int upper = 0;
        int lower = 0;


        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                upper++;
            }else{
                lower++;

            }


        }
        System.out.println("total upper " +upper );
        System.out.println("total lower " +lower );
    }
}
