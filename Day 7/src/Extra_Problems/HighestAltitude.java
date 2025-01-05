package Extra_Problems;
import java.util.Scanner;
public class HighestAltitude {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=o.nextInt();
        }
        int max=0;
        int j=0;
        for(int i:a)
        {
            j+=i;
            if(max<j) {
                max=j;
            }
        }
        System.out.println("Highest Altitude:"+max);
    }
}
