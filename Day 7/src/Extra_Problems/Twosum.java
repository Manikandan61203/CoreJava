package Extra_Problems;
import java.util.Scanner;
public class Twosum {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=o.nextInt();
        }
        int t=o.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==t)
                {
                    System.out.println("["+i+","+j+"]");
                    return;
                }
            }
        }
    }
}
