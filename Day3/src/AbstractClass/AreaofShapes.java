package AbstractClass;
abstract class Shape {
    public abstract double calcArea();
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius=radius;
    }
    @Override
    public double calcArea() {
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double breadth;
    public Rectangle(double length,double breadth) {
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public double calcArea() {
        return length*breadth;
    }
}
public class AreaofShapes {
    public static void main(String args[]) {
        Circle cir=new Circle(5);
        System.out.println("Area of Circle: "+cir.calcArea());
        Rectangle rec=new Rectangle(4,6);
        System.out.println("Area of Rectangle: "+rec.calcArea());
    }
}

