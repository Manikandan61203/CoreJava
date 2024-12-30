package Interface;
interface Vehicle {
    void start();
}
interface FourWheeler extends Vehicle {
    void drive();
}
interface TwoWheeler extends Vehicle {
    void ride();
}
class Car implements FourWheeler {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }
}
class Bike implements TwoWheeler {
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }
    @Override
    public void ride() {
        System.out.println("Bike is riding.");
    }
}
public class VehicleTest {
    public static void main(String args[]) {
        Car car = new Car();
        car.start();
        car.drive();
        Bike bike = new Bike();
        bike.start();
        bike.ride();
    }
}

