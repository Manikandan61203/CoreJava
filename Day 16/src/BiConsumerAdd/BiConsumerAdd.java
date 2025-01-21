package BiConsumerAdd;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class BiConsumerAdd {
    public BiConsumerAdd() {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter Two Numbers :");
        int a=o.nextInt();
        int b=o.nextInt();
        BiConsumer<Integer,Integer> c=(m, n)-> System.out.println("Sum of "+m+" and "+n+" is "+(m+n));
        c.accept(a,b);
    }
    public static void main(String[] args) {
        BiConsumerAdd bca=new BiConsumerAdd();
    }
}
