package StringStartsWithLetter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class StringStartsWithLetter {
    public StringStartsWithLetter() {
        Scanner o=new Scanner(System.in);
        List<String> l1=new ArrayList<>();
        System.out.println("Enter Number of Strings :");
        int n=o.nextInt();
        System.out.println("Enter the Strings :");
        for(int i=0;i<n;i++)
        {
            l1.add(o.next());
        }
        System.out.println("Enter the Starting Letter :");
        String s=o.next();
        checkString(l1,s,(m)->m.startsWith(s));

    }
    public void checkString(List<String> l1,String s, Predicate<String> p)
    {
        List<String> l2 = new ArrayList<>();
        l1.forEach(i->{
            if(p.test(i))
                l2.add(i);
        });
        System.out.println(l2);
    }

    public static void main(String[] args) {
        StringStartsWithLetter sswl=new StringStartsWithLetter();
    }
}
