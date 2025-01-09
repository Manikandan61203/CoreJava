package LinkedList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class TaskManage {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter no of Task:");
        int n=o.nextInt();
        LinkedList<String> task=new LinkedList<>();
        o.nextLine();
        for(int i=0;i<n;i++)
        {
            task.add(o.nextLine());
        }
        display(task);
        System.out.println("Enter the Task to addLast:");
        task.addLast(o.nextLine());
        display(task);
        System.out.println("Enter the Task to Remove:");
        task.remove(o.nextLine());
        display(task);
    }
    public static void display(LinkedList<String> task)
    {
        System.out.println("Task List: ");
        int i=1;
        Iterator<String> it= task.iterator();
        while(it.hasNext())
        {
            System.out.println((i++)+". "+it.next());
        }
    }
}
