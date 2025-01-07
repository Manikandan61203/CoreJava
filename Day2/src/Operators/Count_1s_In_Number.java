package Operators;
import java.util.Scanner;
public class Count_1s_In_Number {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        int t=n;
        int i=(n/2)+1;
        int a[]=new int[i];
        while(t!=0)
        {
            int r=t%2;
            a[--i]=r;
            t=t/2;
        }
        int c=0;
        for(int j:a)
        {
            if(j==1)
                c++;
        }
        System.out.println("Count of 1s in Number is "+c);
    }
}
