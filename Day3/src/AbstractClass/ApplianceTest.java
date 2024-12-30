package AbstractClass;
abstract class Appliance {
    public abstract void turnOn();
    public void turnOff() {
        System.out.println("Appliance is turned off.");
    }
}
class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan is turned on.");
    }
}
public class ApplianceTest {
    public static void main(String args[]) {
        Fan o=new Fan();
        o.turnOn();
        o.turnOff();
    }
}
