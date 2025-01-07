package ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ShoppingList {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        List<String> sl=new ArrayList<>();
        System.out.println("Enter no of items:");
        int n=o.nextInt();
        System.out.println("Enter Items:");
        for (int i=0;i<n;i++){
            sl.add(o.next());
        }
        System.out.println("Shopping List:"+sl);
        System.out.println("Enter Item to Remove:");
        String rem=o.next();
        sl.remove(rem);
        System.out.println("After Removal:");
        System.out.println("Shopping List:"+sl);
    }
}
