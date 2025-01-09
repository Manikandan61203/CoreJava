package Generic;
public class Box<T> {
    private T item;
    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    public void display(){
        System.out.println(item);
    }
    public boolean isTypeOf(Class<?> cls)
    {
        return cls.isInstance(item);
    }
    public static void main(String[] args) {
        Box<String> string=new Box<>();
        string.setItem("Generic Type");
        string.display();
        System.out.println("String Type is "+string.isTypeOf(String.class));
        Box<Integer> Int=new Box<>();
        Int.setItem(151);
        Int.display();
        System.out.println("Integer Type is "+Int.isTypeOf(Integer.class));
        Box<Double> Dou=new Box<>();
        Dou.setItem(44.86);
        Dou.display();
        System.out.println("Double Type is "+Dou.isTypeOf(Double.class));
        class CustomClass
        {
            @Override
            public String toString() {
                return "CustomCLass Instance";
            }
        }
        Box<CustomClass> cc=new Box<>();
        cc.setItem(new CustomClass());
        cc.display();
        System.out.println("CustomClass Type is "+cc.isTypeOf(CustomClass.class));
    }
}
