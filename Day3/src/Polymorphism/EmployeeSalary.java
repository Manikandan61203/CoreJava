package Polymorphism;
class Employee {
    public void calcSalary() {
        System.out.println("Calculating salary for Employee");
    }
}
class Manager extends Employee {
    @Override
    public void calcSalary() {
        System.out.println("Calculating salary for Manager Rs:80,000");
    }
}
class Developer extends Employee {
    @Override
    public void calcSalary() {
        System.out.println("Calculating salary for Developer Rs:70,000");
    }
}
public class EmployeeSalary {
    public static void main(String args[]) {
        Employee emp = new Employee();
        emp.calcSalary();
        Manager mgr = new Manager();
        mgr.calcSalary();
        Developer dev = new Developer();
        dev.calcSalary();
        Employee empMgr = new Manager();
        empMgr.calcSalary();
        Employee empDev = new Developer();
        empDev.calcSalary();
    }
}

