package ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ParallelStream {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        System.out.println("Enter No of Number :");
        int n=o.nextInt();
        System.out.println("Enter the "+n+" Numbers :");
        for(int i=0;i<n;i++)
        {
            l.add(o.nextInt());
        }
        List<Integer> ps=l.parallelStream()
                .filter(num->num>50)
                .map(n1->n1*n1)
                .limit(10)
                .collect(Collectors.toList());
        ps.forEach(System.out::println);
    }
}
