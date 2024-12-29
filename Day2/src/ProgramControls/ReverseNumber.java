package ProgramControls;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner o = new Scanner(System.in);
        int n = o.nextInt();
        String s = Integer.toString(n);
        int i = s.length();
        int m = 0;
        while (n != 0) {
            int r = n % 10;
            m = m * 10 + r;
            n = n / 10;
        }
        String s2 = String.format("%0" + i + "d", m);
        System.out.println(s2);
    }
}
