package Operators;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        if(n<=1)
        {
            System.out.println("Given number is not a Prime Number");
            return;
        }
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)
            System.out.println("Given Number is Prime Number");
        else
            System.out.println("Given number is not a Prime Number");
    }
}
