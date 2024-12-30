package Static;
import java.util.Scanner;
public class Utility {
    public static String convertToUpper(String s){
        if(s==null)
            return null;
        return s.toUpperCase();
    }
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        String s=o.next();
        System.out.println("Original String :"+s+" | UpperCase :"+Utility.convertToUpper(s));
    }
}
