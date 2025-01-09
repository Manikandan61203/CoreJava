package Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class StoreUniqueNames {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter Names Seperated with (,):");
        String s[]=o.nextLine().split(",");
        Set<String> sun=new LinkedHashSet<>();
        for (int i=0;i<s.length;i++)
        {
            sun.add(s[i]);
        }
        System.out.println("Unique Names: "+sun);
    }
}
