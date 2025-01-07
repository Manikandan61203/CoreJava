package OOPS_Basics;
class Animal{
    public void speak() {
        System.out.println("Animals Make Sound");
    }
}
class Dog extends Animal
{
    public void speak() {
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal
{
    public void speak() {
        System.out.println("Cat Meows");
    }
}
public class AnimalSound {
    public static void main(String args[])
    {
        Dog dog=new Dog();
        Cat cat=new Cat();
        dog.speak();
        cat.speak();
    }
}
