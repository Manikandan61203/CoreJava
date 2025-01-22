package UnaryToStringUppercase;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class UnaryToStringUppercase {
    public UnaryToStringUppercase() {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the String :");
        String s=o.next();
        UnaryOperator<String> uo=(s1)->s1.toUpperCase();
        System.out.println("Uppercase of The Given String :"+uo.apply(s));
    }

    public static void main(String[] args) {
        UnaryToStringUppercase utsu=new UnaryToStringUppercase();
    }
}
