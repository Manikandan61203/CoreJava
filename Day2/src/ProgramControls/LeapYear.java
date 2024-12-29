package ProgramControls;
import java.util.Scanner;
public class LeapYear {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        int y=o.nextInt();
        if(((y%4==0)&&(y%100!=0))||(y%400==0))
            System.out.println("Given Year is a Leap year");
        else
            System.out.println("Given Year is Not a Leap Year");
    }
}
