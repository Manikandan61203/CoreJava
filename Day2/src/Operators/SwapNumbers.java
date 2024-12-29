package Operators;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        int a=o.nextInt();
        int b=o.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Swap Number a:"+a);
        System.out.println("Swap Number b:"+b);
    }
}
