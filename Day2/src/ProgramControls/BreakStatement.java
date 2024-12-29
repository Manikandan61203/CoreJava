package ProgramControls;
import java.util.Scanner;
public class BreakStatement {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        boolean b=false;
        while(b!=true)
        {
            int n=o.nextInt();
            if(n==0)
                break;
            else
                b=false;
        }
    }
}
