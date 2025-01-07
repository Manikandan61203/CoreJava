package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class ReverseList {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        System.out.println("Enter the Size of List:");
        int n=o.nextInt();
        System.out.println("Enter the Values:");
        for(int i=0;i<n;i++)
        {
            l.add(o.nextInt());
        }
        System.out.println("Original List:"+l);
        Collections.reverse(l);
        System.out.println("Reversed List:"+l);
    }
}
