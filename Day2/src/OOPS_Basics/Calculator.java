package OOPS_Basics;
public class Calculator {
    public void Add(int a,int b)
    {
        System.out.println("Addition of Two Integers is "+(a+b));
    }
    public void Add(double a,double b)
    {
        System.out.println("Addition of Two Doubles is "+(a+b));
    }
    public void Add(int arr[])
    {
        int s=0;
        for(int i:arr)
        {
            s+=i;
        }
        System.out.println("Additions of an Array is "+s);
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        Calculator o=new Calculator();
        o.Add(4.5,6.7);
        o.Add(10,59);
        o.Add(arr);
    }
}
