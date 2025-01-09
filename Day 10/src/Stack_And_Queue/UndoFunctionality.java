package Stack_And_Queue;
import java.util.Scanner;
import java.util.Stack;
public class UndoFunctionality {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        Stack<String> st=new Stack<>();
        System.out.println("Stack Operations");
        System.out.println("1.Add");
        System.out.println("2.Undo");
        System.out.println("3.Display");
        System.out.println("4.Quit");
        boolean con=true;
        while(con)
        {
            System.out.println();
            System.out.println("Enter Your Choice:");
            int choice=o.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter Name to add:");
                    String name = o.next();
                    st.push(name);
                    break;
                case 2:
                    st.pop();
                    System.out.println("Undo Executed");
                    break;
                case 3:
                    System.out.print("Current Text: ");
                    for (int i=0;i< st.size();i++)
                    System.out.print(st.get(i)+" ");
                    break;
                case 4:
                    con = false;
                    break;
                default:
                    System.out.println("Provide Valid Choice");
            }
        }
    }
}
