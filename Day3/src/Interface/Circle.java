package Interface;
interface Constants {
    double PI=3.14;
}
public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calcArea() {
        return Constants.PI*radius*radius;
    }
    public static void main(String args[]) {
        Circle o=new Circle(5);
        double area=o.calcArea();
        System.out.println("Area of the circle: "+area);
    }
}
