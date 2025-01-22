package MethodReferenceConstructor;

class Student {
    String name;
    int marks;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        System.out.println("New Student Object Created.");
        System.out.println();
    }

    @Override
    public String toString() {
        return name+" : "+marks;
    }
}
