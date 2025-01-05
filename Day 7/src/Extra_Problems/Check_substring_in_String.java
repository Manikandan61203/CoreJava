package Extra_Problems;
import java.util.Scanner;
public class Check_substring_in_String {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        String s=o.nextLine();
        String s1[]=s.split(" ");
        String s2=o.next();
        int c=0;
        for(int i=0;i<s1.length;i++)
        {
            if(s2.contains(s1[i]))
                c++;
        }
        System.out.println(c);
    }
}
