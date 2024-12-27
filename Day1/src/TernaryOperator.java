import java.util.Scanner;
public class TernaryOperator {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        if(n==0)
            return;
        String r=(n%2==0)?"Even":"Odd";
        System.out.println("the Given Number is "+r);
    }
}
