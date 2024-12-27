import java.util.Scanner;
public class Primitive_Type_Conversion {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        float f1=o.nextFloat();
        int i=(int)f1;
        System.out.println("Float:"+f1);
        System.out.println("Integer:"+i);
    }
}
