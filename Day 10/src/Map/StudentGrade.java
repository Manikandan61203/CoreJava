package Map;
import java.util.*;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner o1=new Scanner(System.in);
        HashMap<String, Integer> sg = new HashMap<>();
        add(sg);
        System.out.println("Enter any entry you want to update:");
        o1.nextLine();
        add(sg);
        System.out.println("Enter Name to Retrive:");
        String name=o1.next();
        System.out.println(name+" grade: "+sg.get(name));
        display(sg);
    }
    public static void add(HashMap<String,Integer> sg)
    {
        Scanner o = new Scanner(System.in);
        System.out.println("Enter Number Of Students:");
        int n = o.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Name:");
            String name = o.next();
            System.out.println("Enter Grade:");
            int num = o.nextInt();
            sg.put(name, num);
        }
    }
    public static void display(HashMap<String,Integer> sg)
    {
        System.out.println("All Students and grade: ");
        for(Map.Entry<String,Integer> i:sg.entrySet())
        {
            System.out.println(i.getKey()+":"+i.getValue());
        }
    }
}
