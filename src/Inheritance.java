public class Inheritance {
}
class Employee {
    String name;
    double salary;
    Employee (String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    void show() {
        System.out.println("Name :" + name + ", Salary : " + salary);
    }
}

class Manager extends Employee {
    String department;
    Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }
}