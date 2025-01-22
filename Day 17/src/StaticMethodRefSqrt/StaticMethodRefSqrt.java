package StaticMethodRefSqrt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class StaticMethodRefSqrt {
    public StaticMethodRefSqrt() {
        Scanner o=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        System.out.println("Enter No of Numbers :");
        int n=o.nextInt();
        System.out.println("Enter "+n+" Numbers :");
        for(int i=0;i<n;i++)
            l.add(o.nextInt());
//      DoubleFunction<Double> df=Math::sqrt;
        DoubleFunction<Double> df=StaticMethodRefSqrt::sub;
        l.forEach(i->{
            System.out.println("Square Root of "+i+" is "+df.apply(i));
        });

    }
    public static Double sub(Double d) {
        return Math.sqrt(d);
    }
    public static void main(String[] args) {
        StaticMethodRefSqrt smrs=new StaticMethodRefSqrt();
    }
}
