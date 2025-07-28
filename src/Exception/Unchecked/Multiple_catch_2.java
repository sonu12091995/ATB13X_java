package Exception.Unchecked;

import kotlin.jvm.Throws;

import java.lang.NullPointerException;

public class Multiple_catch_2 {
    public static void main(String[] args) {
        String s1 = null;


       /* try {
            s1.trim();
            int a = 10/0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Null or Arth Error");
        }catch (Exception e){
            System.out.println("Yes");
        }
        System.out.println("End");*/

  try {
      System.out.println(s1.length());
  }catch (ArithmeticException | NullPointerException  e) {
      System.out.println(e.getMessage());

  }
    }
    }
