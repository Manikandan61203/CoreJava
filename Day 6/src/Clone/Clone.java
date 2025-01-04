package Clone;
class Clone implements Cloneable{
    private String name;
    private int age;
    public Clone(String name,int age) {
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Name:"+name+" Age:"+age;
    }
    public static void main(String[] args) {
        try {
            Clone s=new Clone("Manikandan",21);
            System.out.println("Original:" + s.toString());
            Clone c=(Clone)s.clone();
            System.out.println("Clone:"+c.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
