package Polymorphism1;

public class Employee {

    public int getBonus(){
        return 1000;
    }
}

class Manager extends Employee{

    @Override
    public int getBonus(){
        return 3000;
    }
}

class Developer extends  Employee{

    @Override
    public int getBonus(){
        return 2000;
    }

    public static void main(String[] args){
        Employee ee = new Employee();
        Employee e1 = new Manager();
        Employee e2 = new Developer();

        System.out.println("Employee Salary:- " +ee.getBonus());
        System.out.println("Manager Salary:- " +e1.getBonus());
        System.out.println("Developer Salary:- " +e2.getBonus());

    }
}