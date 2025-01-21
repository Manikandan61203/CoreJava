package AverageGPA;
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
}
public class AverageGPA {
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
            l.add(new Student(name,gpa));
        }
        double avggpa=CalcAvg(l);
        System.out.println("Average GPA :"+avggpa);
    }
    public static double CalcAvg(List<Student> l)
    {
        final double[] sum = {0};
        l.forEach(s-> sum[0] +=s.gpa);
        return sum[0] /l.size();
    }
}