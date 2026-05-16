package Abstraction;

abstract class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }

    abstract double calculateSalary();

    public String toString(){
        return "Employee Name:- " +name;
    }
}

class FullTimeEmployee extends Employee{
    double salary;

    FullTimeEmployee(String name,double salary){
        super(name);
        this.salary = salary;
    }

    double calculateSalary(){
        return salary;
    }
}

class PartTimeEmployee extends Employee{
    double salary;

    PartTimeEmployee(String name,double salary){
        super(name);
        this.salary = salary;
    }

    double calculateSalary(){
        return salary;
    }

    public static void main(String[] args){
        Employee e1 = new FullTimeEmployee("Manish Kumar",50000);
        Employee e2 = new PartTimeEmployee("Ronit Raj",20000);


        System.out.println(e1.toString()+ "  /FullTimeEmployee Salary:- " +e1.calculateSalary());
        System.out.println(e2.toString()+ "   /PartTimeEmployee Salary:- "  +e2.calculateSalary());


    }
}
