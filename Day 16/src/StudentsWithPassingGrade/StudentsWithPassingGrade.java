package StudentsWithPassingGrade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

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
        return  name ;
    }
}
public class StudentsWithPassingGrade {
    public StudentsWithPassingGrade() {
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
        chackStudent(l,m->m.grade>60);
    }
    public void chackStudent(List<Student> l, Predicate<Student> p)
    {
        System.out.println("Students With Grade Greater than 60 :");
        l.forEach(i->{
            if(p.test(i))
                System.out.println(i.name);
        });
    }

    public static void main(String[] args) {
        StudentsWithPassingGrade sspg=new StudentsWithPassingGrade();
    }
}
