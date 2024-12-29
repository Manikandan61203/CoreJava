package Operators;
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]) {
        Scanner o = new Scanner(System.in);
        int n = o.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println(f);
    }
}
