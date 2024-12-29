package thisKeyword;
public class Employee {
    private int id;
    private String name;
    private int sal;
    public Employee(int id,String name,int sal)
    {
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
    public void display()
    {
        System.out.println("Employee details");
        System.out.println("Id:"+this.id);
        System.out.println("Name:"+this.name);
        System.out.println("Salary:"+this.sal);
    }
    public static void main(String args[])
    {
        Employee o=new Employee(56,"Manikandan",500000);
        o.display();
    }
}
