import java.util.Scanner;
public class BitwiseOperator {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        int lf=n<<2;
        int rf=n>>2;
        System.out.println("LeftShift:"+lf);
        System.out.println("RightShift:"+rf);
        int n1=o.nextInt();
        int n2=o.nextInt();
        int xor=n1^n2;
        System.out.println("Xor Operation:"+xor);
        System.out.println("hari");
    }
}
