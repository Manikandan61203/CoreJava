package FunctionToMapStringLength;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class FunctionToMapStringLength {
    public FunctionToMapStringLength() {
        Scanner o=new Scanner(System.in);
        List<String> l1=new ArrayList<>();
        System.out.println("Enter Number of Strings :");
        int n=o.nextInt();
        System.out.println("Enter the Strings :");
        for(int i=0;i<n;i++)
        {
            l1.add(o.next());
        }
        Function<String,Integer> f=(s)-> s.length();
        List<Integer> l2=new ArrayList<>();
        l1.forEach(i->{
            l2.add(f.apply(i));
        });
        System.out.println(l2);
    }

    public static void main(String[] args) {
        FunctionToMapStringLength ftmsl=new FunctionToMapStringLength();
    }
}
