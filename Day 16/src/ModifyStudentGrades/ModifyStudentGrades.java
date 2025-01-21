package ModifyStudentGrades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

class Student
{
    String name;
    int grade;
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return  name+" : "+grade ;
    }
}
public class ModifyStudentGrades {
    public ModifyStudentGrades() {
        Scanner o = new Scanner(System.in);
        List<Student> l = new ArrayList<>();
        System.out.println("Enter Numbers of Students:");
        int n = o.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Student Name :");
            String name = o.next();
            System.out.println("Enter Grade :");
            int grade = o.nextInt();
            l.add(new Student(name, grade));
        }
        Consumer<Student> c=(sg)->{
            sg.grade+=10;
            System.out.println(sg);
        };
        l.forEach(c);
    }

    public static void main(String[] args) {
        ModifyStudentGrades msg=new ModifyStudentGrades();
    }
}
