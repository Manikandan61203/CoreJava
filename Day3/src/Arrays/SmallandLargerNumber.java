package Arrays;
import java.util.Scanner;
public class SmallandLargerNumber {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i] = o.nextInt();
        }
        int s=Integer.MAX_VALUE;
        int l=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(s>a[i])
                s=a[i];
            if(l<a[i])
                l=a[i];
        }
        System.out.println("Small Value in Array:"+s);
        System.out.println("Large Value in Array:"+l);
    }
}
