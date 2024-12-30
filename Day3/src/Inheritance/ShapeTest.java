package Inheritance;
class Shape {
    public double area() {
        return 0.0;
    }
}
class Rectangle extends Shape{
    private double l;
    private double b;
    Rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }

    @Override
    public double area() {
        return l*b;
    }
}
class Square extends Rectangle {
    public Square(double s) {
        super(s,s);
    }
}
public class ShapeTest {
    public static void main(String args[]){
        Rectangle rec=new Rectangle(5,4);
        System.out.println("Area of Rectangle :"+rec.area());
        Square sq=new Square(7);
        System.out.println("Area of Square :"+sq.area());
    }
}
