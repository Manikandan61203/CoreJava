package OOPS_Basics;
public class Car {
    String Brand;
    String Model;
    double Price;
    public Car(String Brand,String Model,double Price)
    {
        this.Brand=Brand;
        this.Model=Model;
        this.Price=Price;
    }
    void Display()
    {
        System.out.println("Car Details");
        System.out.println("Brand:"+Brand);
        System.out.println("Model:"+Model);
        System.out.println("Price:"+Price);
    }
    public double Discount(int disper)
    {
        double disval = (Price * disper) / 100;
        return Price-disval;
    }
    public static void main(String args[])
    {
        Car o=new Car("Maruti","Zen",350000);
        int disper=10;
        o.Display();
        double disprice=o.Discount(disper);
        System.out.println("Discounted Price:"+disprice);
    }
}
