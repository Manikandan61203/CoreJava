import java.util.List;

public class Student {
    String Name;
    String Dept;
    List<Integer> marks;
    Double Avg;
    String Grade;

    public Student(String name, String dept, List<Integer> marks, Double avg) {
        Name = name;
        Dept = dept;
        this.marks = marks;
        Avg = avg;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public Double getAvg() {
        return Avg;
    }

    public void setAvg(Double avg) {
        Avg = avg;
    }

    public String  getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public double CalcAvg()
    {
        return marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public boolean hasFailed(){
        return "Fail".equals(this.Grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Dept='" + Dept + '\'' +
                ", marks=" + marks +
                ", Avg=" + Avg +
                ", Grade=" + Grade +
                '}';
    }
}
