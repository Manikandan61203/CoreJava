package Reflection;
public class Person {
    private String name;
    private int age;
    private String job;
    private String  dept;
    public Person(String dept) {
        this.dept=dept;
    }
    public Person(String name, int age, String job)
    {
        this.name=name;
        this.age=age;
        this.job=job;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getJob() {
        return job;
    }
    private String getDept() {
        System.out.println(dept);
        return "";
    }
    public void getDetails()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Job:"+job);
    }
}
