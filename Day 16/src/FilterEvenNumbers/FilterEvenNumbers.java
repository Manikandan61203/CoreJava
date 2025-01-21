package FilterEvenNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class FilterEvenNumbers {
    public FilterEvenNumbers() {
        Scanner o = new Scanner(System.in);
        List<Integer> l1 = new ArrayList<>();
        System.out.println("Enter Numbers of Integers :");
        int n = o.nextInt();
        System.out.println("Enter the "+n+" Numbers :");
        for (int i = 0; i < n; i++) {
            l1.add(o.nextInt());
        }
        checkEven(l1,(m)->m%2==0);
    }
    public void checkEven(List<Integer> l1,IntPredicate ip) {
        List<Integer> l2 = new ArrayList<>();
        l1.forEach(l -> {
            if (ip.test(l))
                l2.add(l);
        });

        System.out.println(l2);
    }

    public static void main(String[] args) {
        FilterEvenNumbers fen=new FilterEvenNumbers();
    }
}
