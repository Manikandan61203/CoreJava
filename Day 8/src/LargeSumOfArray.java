import java.util.Scanner;
public class LargeSumOfArray {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        String s[]=o.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int max1=0;
        int max2=0;
        for(int i=0;i<a.length;i++)
        {
            max1=Math.max(a[i],max1+a[i]);
            max2=Math.max(max1,max2);
        }
        System.out.println("Largest Sum of SubArray:"+max2);
    }
}
