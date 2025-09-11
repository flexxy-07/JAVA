package OOPS.Encapsulation;

import java.lang.reflect.Field;

class Employee{ // private means within the same class
    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    private double salary = 1000;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary < 0){
            System.out.println("Invalid Amount!!");
        }else{
            this.salary = salary;
        }

    }

    private String name;
}
public class Encapsu {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee obj = new Employee();

        // bypassing the code to access the private data of that class : Through Reflection (But this is an Illegal way)
//        Field fsalary = Employee.class.getDeclaredField("salary");
//        fsalary.setAccessible(true);
//        System.out.println(fsalary.get(obj));


        // Accessing through getter setter methods
        obj.setSalary(100000);
        System.out.println(obj.getSalary());
    }
}