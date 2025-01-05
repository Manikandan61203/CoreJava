package Extra_Problems;
import java.util.Scanner;
public class MinCost {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=o.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i:a)
        {
            if(i%2==0)
                even++;
            else
                odd++;
        }
        System.out.println(Math.min(odd,even));
    }
}
