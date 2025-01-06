import java.util.Arrays;
import java.util.Scanner;
public class MissingRangeNum {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        String s[]=o.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i+1]-a[i]!=1)
            {
                System.out.println(i+1);
                return;
            }
        }
    }
}
