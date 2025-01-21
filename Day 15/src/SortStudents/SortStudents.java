package SortStudents;

import java.util.*;

public class SortStudents {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        List<Students> l=new ArrayList<>();
        System.out.println("Enter Numbers of Students:");
        int n=o.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Student Name :");
            String name=o.next();
            System.out.println("Enter GPA :");
            double gpa=o.nextDouble();
            l.add(new Students(name,gpa));
        }
        Collections.sort(l,(s1,s2)->Double.compare(s2.getGpa(),s1.getGpa()));
        System.out.println(l);
    }
}
