package BinaryToFindMax;

import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class BinaryToFindMax {
    public BinaryToFindMax() {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter Two Numbers :");
        int a=o.nextInt();
        int b=o.nextInt();
        IntBinaryOperator ibo=(a1,b1)->Math.max(a1,b1);
        System.out.println("Maximum of Given Two Numbers :"+ibo.applyAsInt(a,b));
    }

    public static void main(String[] args) {
        BinaryToFindMax btfm=new BinaryToFindMax();
    }
}
