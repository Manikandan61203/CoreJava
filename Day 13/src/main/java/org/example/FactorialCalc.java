package org.example;
public class FactorialCalc {
    public static long Calc(int n)
    {
        if(n<0) {
            System.out.println("Negative Numbers not Allowed!");
            return 0;
        }
        long r=1;
        for(int i=n;i>=1;i--) {
            r *= i;
        }
        return r;
    }
}
