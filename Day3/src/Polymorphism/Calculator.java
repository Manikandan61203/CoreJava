package Polymorphism;
public class Calculator {
    public int add(int a,int b) {
        return a+b;
    }
    public double add(double a,double b) {
        return a+b;
    }
    public int add(int a,int b,int c) {
        return a+b+c;
    }
    public static void main(String args[])
    {
        Calculator o=new Calculator();
        int sum1=o.add(5,3);
        System.out.println("Sum of 2 Integers: "+sum1);
        double sum2=o.add(5.5,3.3);
        System.out.println("Sum of 2 Doubles: "+sum2);
        int sum3=o.add(1,2,3);
        System.out.println("Sum of 3 Integers: "+sum3);
    }
}

