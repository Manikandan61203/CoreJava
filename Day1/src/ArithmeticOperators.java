import java.util.Scanner;
public class ArithmeticOperators {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        int n1=o.nextInt();
        int n2=o.nextInt();
        System.out.println("Addition Operator(+):"+(n1+n2));
        System.out.println("Subraction Operator(-):"+(n1-n2));
        System.out.println("Multiplication Operator(*):"+(n1*n2));
        System.out.println("Division Operator(/):"+(n1/n2));
        System.out.println("Modulus Operator(%):"+(n1%n2));

    }
}
