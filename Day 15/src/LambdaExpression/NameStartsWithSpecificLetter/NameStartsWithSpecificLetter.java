package LambdaExpression.NameStartsWithSpecificLetter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Student
{
    String name;
    double gpa;
    public Student(String name,double gpa) {
        this.gpa = gpa;
        this.name = name;
    }
    @Override
    public String toString() {
        return name+" : "+gpa;
    }
}
public class NameStartsWithSpecificLetter {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        List<Student> l1 = new ArrayList<>();
        System.out.println("Enter Numbers of Students:");
        int n = o.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Student Name :");
            String name = o.next();
            System.out.println("Enter GPA :");
            double gpa = o.nextDouble();
            l1.add(new Student(name, gpa));
        }
        System.out.println("Enter the Starting letter :");
        String s1=o.next();
        List<Student> l2 = new ArrayList<>();
        l1.forEach(s ->{
            if(s.name.charAt(0)==s1.charAt(0)){
                l2.add(s);
            }
        } );
        System.out.println("Students Name Starts with "+s1.charAt(0)+" Letter :");
        l2.forEach(System.out::println);
    }
}
