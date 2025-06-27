package Array_2__D;

public class Left_Trangle {
    public static void main(String[] args) {
     /*for (int i = n; i >= 1; i--)

Outer loop starts from n and goes down to 1.
Controls the number of rows.
i-- means it decreases by 1 each iteration (counting down).
for (int j = 1; j <= i; j++)
Inner loop runs from 1 to the current value of i.
Controls how many stars (*) to print on each row.
As i decreases, fewer stars are printed.*/

        int n= 3;
        for (int i=n; i>=1;i--)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
