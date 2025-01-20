package LambdaExpression.TopScoreByDepartment;

import java.util.*;

public class TopScoreByDept {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        List<Student> l=new ArrayList<>();
        System.out.println("Enter Numbers of Students:");
        int n=o.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Student Name :");
            String name=o.next();
            System.out.println("Enter GPA :");
            double gpa=o.nextDouble();
            System.out.println("Enter Department :");
            String d=o.next();
            l.add(new Student(name,gpa,d));
        }
        Map<String,Student> tsbd=new HashMap<>();
        for(Student s:l) {
            String dept = s.getDept();
            if (!tsbd.containsKey(dept) || s.gpa > tsbd.get(dept).gpa) {
                tsbd.put(dept, s);
            }
        }
        tsbd.forEach((dept,s)-> System.out.println("Top Scorer in "+dept+" : "+s));
    }
}
