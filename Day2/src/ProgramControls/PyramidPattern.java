package ProgramControls;
import java.util.Scanner;
public class PyramidPattern {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>=0;j--)
            System.out.print(" ");
            for(int k=0;k<=i+i;k++)
            System.out.print("*");
            System.out.println();
        }
    }
}
