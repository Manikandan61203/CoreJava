package Inheritance;
class Animal{
    public void sound() {
        System.out.println("Animals Make Sound");
    }
}
class Dog extends Animal
{
    @Override
    public void sound() {
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal
{
    @Override
    public void sound() {
        System.out.println("Cat Meows");
    }
}
public class AnimalsSound {
    public static void main(String args[])
    {
        Dog dog=new Dog();
        Cat cat=new Cat();
        dog.sound();
        cat.sound();
    }
}
