package StudentMethodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMethodReference {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        List<Student> l=new ArrayList<>();
        System.out.println("Enter Numbers of Students:");
        int n=o.nextInt();
            for(int i=0;i<n;i++)
        {
            System.out.println("Enter Student Name :");
            String name=o.next();
            System.out.println("Enter Marks :");
            int marks=o.nextInt();
            l.add(new Student(name,marks));
        }
        System.out.println("Student Objects :");
        l.forEach(Student::displayStudentDetails);
    }
}
