package Inheritance1;

public class Employee1 {
    String name;

    Employee1(String name){
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Employee Name:- " +name);
    }
}

class Manager extends Employee1{
    String departments;

    Manager(String name,String departments){
        super(name);
        this.departments = departments;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Departments:- " +departments);
    }


    public static void main(String[] args){
        Employee1 ee = new Manager("Manish","HR");
        ee.displayInfo();
    }
}