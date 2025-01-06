import java.util.Arrays;
import java.util.Scanner;
public class NextGreaterNum {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        String s[]=o.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int n=s.length;
        int r[]=new int[n];
        Arrays.fill(r,-1);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[j]>a[i])
                {
                    r[i]=a[j];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(r));
    }
}
