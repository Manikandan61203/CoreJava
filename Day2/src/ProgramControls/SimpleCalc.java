package ProgramControls;
import java.util.Scanner;
public class SimpleCalc {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("1.Addition");
        System.out.println("2.Subraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Remainder");
        System.out.println("6.Percentage");
        System.out.println("Enter Two Numbers and Choose the Options");
        double n1=o.nextInt();
        double n2=o.nextInt();
        int c=o.nextInt();
        switch (c)
        {
            case 1:
                System.out.println("Addition of Two Numbers is "+(n1+n2));
                break;
            case 2:
                System.out.println("Subraction of Two Numbers is "+(n1-n2));
                break;
            case 3:
                System.out.println("Multiplication of Two Numbers is "+(n1*n2));
                break;
            case 4:
                if(n2!=0)
                    System.out.println("Division of Two Numbers is "+(n1/n2));
                else
                    System.out.println("ERROR:Divisor Cant Be Zero");
                break;
            case 5:
                System.out.println("Remainder of Two Numbers is "+(n1%n2));
                break;
            case 6:
                System.out.println("Percentage of Two Numbers is "+(n1/n2)*100);
                break;
            default:
                System.out.println("Invalid Choice Please Select the Valid Options");
                break;
        }

    }
}
