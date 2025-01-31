public class Student {
    private int Id;
    private String  Name;
    private int Age;
    private String Grade;
    private String Email;

    public Student() {
    }

    public Student(int id, String name, int age, String grade, String email) {
        Id = id;
        Name = name;
        Age = age;
        Grade = grade;
        Email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return '\n'+" Id=" + Id + ","+'\n' +
                " Name='" + Name + '\''+ ","+'\n' +
                " Age=" + Age +","+'\n' +
                " Grade='" + Grade + '\''+","+'\n' +
                " Email='" + Email + '\''+ '\n' ;
    }
}
