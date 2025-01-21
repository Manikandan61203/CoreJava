package TransformNames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransformNames {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        List<String> l1=new ArrayList<>();
        System.out.println("Enter Numbers of Students:");
        int n=o.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.println("Enter Student"+i+" :");
            l1.add(o.next());
        }
        List<String> l2=new ArrayList<>();
        for (String s:l1)
        {
            l2.add("Student: "+s.toUpperCase());
        }
        l2.forEach(System.out::println);
    }
}
