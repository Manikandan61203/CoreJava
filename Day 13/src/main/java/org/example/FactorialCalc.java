package org.example;
public class FactorialCalc {
    public static long Calc(int n)
    {
        if(n<0) {
            throw new IllegalArgumentException("Negative Numbers are Not Allowed");
        }
        long r=1;
        for(int i=n;i>=1;i--) {
            r *= i;
        }
        return r;
    }
}
