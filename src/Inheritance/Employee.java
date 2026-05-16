package Inheritance;

public class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Employee Name:- " +name);
    }
}

class Manager extends Employee{
    String departments;

    Manager(String name,String departments){
        super(name);
        this.departments = departments;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Departments:-  " +departments);
    }

    public static void main(String[] args){
        Employee ee = new Manager("Manish Yadav","Fresher");
        ee.displayInfo();
    }
}
