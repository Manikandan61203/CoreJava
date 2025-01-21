package TopScoreByDepartment;

public class Student {
    String name;
    double gpa;
    String dept;
    public Student(String name, double gpa, String dept){
        this.name=name;
        this.gpa=gpa;
        this.dept=dept;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    @Override
    public String toString() {
        return name+" : "+gpa;
    }
}
