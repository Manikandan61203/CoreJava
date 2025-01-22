package SupplierToGenerateRandomNumber;

import java.util.function.Supplier;

public class SupplierToGenerateRandomNumber {
    public SupplierToGenerateRandomNumber() {
        Supplier<Integer> is=()->(int)(Math.random()*101);
        for(int i=1;i<=5;i++)
            System.out.println(i+".Random Number :"+is.get());
    }

    public static void main(String[] args) {
        SupplierToGenerateRandomNumber stgrn=new SupplierToGenerateRandomNumber();
    }
}
