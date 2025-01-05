package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Division{
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        try
        {
            System.out.print("Enter the first number:");
            int num1=o.nextInt();
            System.out.print("Enter the second number:");
            int num2=o.nextInt();
            int result=num1/num2;
            System.out.println("The result is:"+result);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input.Please enter numeric values.");
        }
        catch(Exception e) {
            System.out.println("An error occurred:"+e.getMessage());
        }
    }
}
