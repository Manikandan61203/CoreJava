package SupplierToReturnDateAndTime;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierToReturnDateAndTime {
    public SupplierToReturnDateAndTime() {
        Supplier<Calendar> cs=()->Calendar.getInstance();
        System.out.println("Current Date and Time :"+cs.get().getTime());
    }
    public static void main(String[] args) {
        SupplierToReturnDateAndTime strdt=new SupplierToReturnDateAndTime();
    }
}
