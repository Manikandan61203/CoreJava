package Operators;
import java.util.Scanner;
public class Largest_3_Numbers {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        int n1=o.nextInt();
        int n2=o.nextInt();
        int n3=o.nextInt();
        int r=(n1>n2&&n1>n3)?n1:(n2>n1&&n2>n3)?n2:n3;
        System.out.println(r);
    }
}
