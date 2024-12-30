package Interface;
interface Animal {
    void eat();
    void sleep();
}
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}
class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping.");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
    }
}
