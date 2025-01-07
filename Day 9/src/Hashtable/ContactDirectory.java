package Hashtable;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class ContactDirectory {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        Hashtable<String,String>cd=new Hashtable<>();
        System.out.println("Enter Number Of Entries:");
        int n=o.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Name:");
            String name=o.next();
            System.out.println("Enter Number:");
            String num=o.next();
            cd.put(name,num);
        }
        System.out.println("Contact Directory:");
        Set<Map.Entry<String,String>> entry=cd.entrySet();
        for(Map.Entry<String,String> i:entry)
        {
            System.out.println(i.getKey()+":"+i.getValue());
        }
        System.out.println("Enter Your Search");
        String search=o.next();
        System.out.println("Search for "+search+":"+cd.get(search));
        System.out.println("Enter Remove Contact:");
        String remov=o.next();
        cd.remove(remov);
        System.out.println("After Removal:");
        for(Map.Entry<String,String> i:entry)
        {
            System.out.println(i.getKey()+":"+i.getValue());
        }
    }
}
