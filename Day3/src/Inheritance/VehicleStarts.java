package Inheritance;
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting and Ready to Race!");
    }
}
public class VehicleStarts {
    public static void main(String args[]) {
        Vehicle v=new Vehicle();
        v.start();
        Car c=new Car();
        c.start();
        Vehicle o = new Car();
        o.start();
    }
}