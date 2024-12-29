package Constructor;
public class Student{
    private String name;
    private int age;
    public Student(String name,int age) {
        this.name=name;
        this.age=age;
    }
    public void display() {
        System.out.println("Student Details:");
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
    }
    public static void main(String args[]) {
        Student s1=new Student("Manikandan",21);
        s1.display();
    }
}
