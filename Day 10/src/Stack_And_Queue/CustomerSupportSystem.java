package Stack_And_Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class CustomerSupportSystem {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        Queue<String> css=new LinkedList<>();
        System.out.println("Enter Customer Names Seperated by (,):");
        String s[]=o.nextLine().split(",");
        for(int i=0;i<s.length;i++)
        {
            css.add(s[i]);
        }
        System.out.println("Serving Customer in FIFO:");
        int serve=o.nextInt();
        while(serve!=0) {
            System.out.println("Serving: "+css.poll());
            serve--;
            System.out.println("Waiting: "+css);
        }
    }
}
