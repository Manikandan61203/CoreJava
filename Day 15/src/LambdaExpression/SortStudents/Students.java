package LambdaExpression.SortStudents;
public class Students {
    String name;
    double gpa;
    public Students(String name,double gpa){
        this.name=name;
        this.gpa=gpa;
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
    @Override
    public String toString() {
        return name+" - "+gpa;
    }
}
