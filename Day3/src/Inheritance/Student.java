package Inheritance;
class Person {
    private String name;
    private int age;
    public Person(String name,int age) {
        this.name=name;
        this.age=age;
    }
    public void displayDetails() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class StudentMark extends Person {
    private int rollNumber;
    private double marks;
    public StudentMark(String name,int age,int rollNumber,double marks) {
        super(name,age);
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public void displayStdDetails() {
        displayDetails();
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Marks: "+marks);
    }
}
public class Student {
    public static void main(String args[]) {
        StudentMark o=new StudentMark("Manikandan",21,56,86.2);
        System.out.println("Student Details:");
        o.displayStdDetails();
    }
}
