package Arrays_Problem;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        String s[]=o.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int n=s.length;
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