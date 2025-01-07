package Vector;
import java.util.Scanner;
import java.util.Vector;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        String s[]=o.nextLine().split(" ");
        int index=o.nextInt();
        Vector <Integer> v=new Vector<>();
        for(int i=0;i<s.length;i++)
        {
            v.add(Integer.parseInt(s[i]));
        }
        v.remove(index);
        int Max=Integer.MIN_VALUE;
        int Min=Integer.MAX_VALUE;
        double Avg=0;
        int Sum=0;
        for(int i=0;i<v.size();i++)
        {
            Max=Math.max(v.get(i),Max);
            Min=Math.min(v.get(i),Min);
            Sum+=v.get(i);
        }
        Avg=Sum/v.size();
        System.out.println("Grades: "+v);
        System.out.println("Highest Grade: "+Max);
        System.out.println("Lowest Grade: "+Min);
        System.out.println("Average Grade: "+Avg);
    }
}
