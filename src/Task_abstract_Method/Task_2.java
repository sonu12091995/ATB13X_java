package Task_abstract_Method;
/*. Bank Interest Calculation
escription: Abstract class Bank with abstract method getInterestRate(). Classes SBI and HDFC implement it.
🔶 Expected Output:

SBI Interest Rate: 6.5%

HDFC Interest Rate: 7.0%*/

abstract class Bank{
    abstract void getInterestRate();
}
class SBI extends Bank{
    void getInterestRate(){
        System.out.println("This is the SBI implimnet abstract class");
    }
}
class HDFC extends Bank{
    void getInterestRate(){
        System.out.println("HDFC Interest Rate: 7.0%*");

    }
}
public class Task_2 {
    public static void main(String[] args) {
        Bank bank = new HDFC();
        bank.getInterestRate();//HDFC Interest Rate: 7.0%*


        Bank bank1 = new SBI();
        bank.getInterestRate();//SBI Interest Rate: 6.5%

    }
}
