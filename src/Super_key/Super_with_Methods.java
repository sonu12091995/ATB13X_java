package Super_key;

class GrandFatherParent{
    void sum(int a){
        System.out.println("sum of the two ");
    }
    void add(int a, int b, int c){
        System.out.println("sum of the two parent number " +(a+b+c));
    }

}
class parent extends GrandFatherParent{
    void sum(int a){
        System.out.println("sum of the two class parent ");
    }
    void add(){
        //System.out.println("sum of the two ");
        super.add(12,34,45);
    }
}



// Main class
public class Super_with_Methods {
    public static void main(String[] args) {
        parent par = new parent();
        par.add();
    }

}
