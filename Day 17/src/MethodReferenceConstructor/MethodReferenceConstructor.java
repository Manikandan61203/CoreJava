package MethodReferenceConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodReferenceConstructor {
    public static void main(String[] args) {
        StudentFactory sf=Student::new;
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
            l.add(sf.create(name,marks));
        }
        System.out.println("Created Objects are :");
        l.forEach(s-> System.out.println(s));
    }
}
