package Set;
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
            if(sun.add(s[i])){
                System.out.println("Added: "+s[i]);
            }
            else{
                System.out.println("Name is already Present(Duplicate): "+s[i]);
            }
        }
        System.out.println("Unique Names: "+sun);
    }
}
