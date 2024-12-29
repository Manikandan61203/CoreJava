package MethodOverloading;
public class AreaCalc {
    public double Calulate(double length, double width) {
        return length * width;
    }
    public double Calulate(double radius) {
        return Math.PI * radius * radius;
    }
    public double Calulate(double base, double heigth, boolean triangle) {

        return 0.5*base*heigth;
    }
    public static void main(String args[])
    {
        AreaCalc o=new AreaCalc();
        double Rectangle=o.Calulate(4,6);
        double Circle=o.Calulate(5);
        double Triangle=o.Calulate(5,6,true);
        System.out.println("Area of Rectangle is "+Rectangle);
        System.out.println("Area of Circle is "+Circle);
        System.out.println("Area of Triangle is "+Triangle);
    }
}
