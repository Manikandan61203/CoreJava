package Arrays;
import java.util.Scanner;
public class SumofArray {
    public static void main(String args[]) {
        Scanner o = new Scanner(System.in);
        int n = o.nextInt();
        int s=0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = o.nextInt();
            s+=a[i];
        }
        System.out.println("sum of Array Values :"+s);
    }
}
