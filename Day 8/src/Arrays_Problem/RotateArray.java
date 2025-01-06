package Arrays_Problem;
import java.util.Arrays;
import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args)
    {
        Scanner o=new Scanner(System.in);
        String s[]=o.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<s.length;i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        int k=o.nextInt();
        int n=s.length;
        int b[]=new int[n];
        k=k%n;
        for(int i=0;i<n;i++)
        {
            b[(i+k)%n]=a[i];
        }
        System.out.println(Arrays.toString(b));

    }
}
