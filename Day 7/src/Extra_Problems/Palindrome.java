package Extra_Problems;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        String s=o.next();
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s)
    {
        int l=0,r=s.length()-1;
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r)) {
                return isPalindrome(s,l+1,r)||isPalindrome(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
    private static boolean isPalindrome(String s,int l,int r)
    {
        while (l<r)
        {
            if (s.charAt(l)!=s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

