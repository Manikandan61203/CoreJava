import java.util.Scanner;
public class GreaterNumber {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        int n1=o.nextInt();
        int n2=o.nextInt();
        if(n1==n2)
        {
            System.out.println("Both are Same Number.");
            return;
        }
        if((n1>0)&&(n2>0))
        System.out.println("Both are Positive.");
        if(n1>n2)
        System.out.println("First Number is Greater than Second Number.");
        else
        System.out.println("Second Number is Greater than First Number.");
    }
}
