public class PrimitiveTypes {
    public static void main(String args[])
    {
        byte byte_1=3;
        short short_1=5;
        int int_1=234;
        long long_1=234576;
        char char_1='m';
        float float_1=2.5f;
        double double_1=256.4832;
        boolean boolean_1=true;
        double doubleint_1=int_1;//Implicit Type Casting
        int doubleint_2=(int)double_1;//Explicit Type Casting
        System.out.println("Byte:"+byte_1);
        System.out.println("Short:"+short_1);
        System.out.println("Int:  "+int_1);
        System.out.println("Long:"+long_1);
        System.out.println("Char:"+char_1);
        System.out.println("Float:"+float_1);
        System.out.println("Double:"+double_1);
        System.out.println("Boolean:"+boolean_1);
        System.out.println("ImplicitTypeCasting:"+doubleint_1);
        System.out.println("ExplicitTypeCasting:"+doubleint_2);
    }
}
