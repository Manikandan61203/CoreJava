package StudentMethodReference;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public void displayStudentDetails(){
        System.out.println(name+" : "+marks);
    }
}
