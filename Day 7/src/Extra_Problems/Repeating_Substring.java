package Extra_Problems;
import java.util.Scanner;
public class Repeating_Substring {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        String s1=o.next();
        String s2=o.next();
        String s=s2;
        int c=0;
        while(s1.contains(s))
        {
            c++;
            s+=s2;
        }
        System.out.println(c);
    }
}
