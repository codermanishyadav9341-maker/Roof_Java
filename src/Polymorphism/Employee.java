package Polymorphism;

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

class Developer extends Employee{

    @Override
    public int getBonus(){
        return 2000;
    }

    public static void main(String[] args){

        Employee ee = new Employee();
        ee.getBonus();

        Employee e1 = new Manager();
        e1.getBonus();

        Employee e2 = new Developer();
        e2.getBonus();

        System.out.println("Employee Bonus:- " +ee.getBonus());
        System.out.println("Manager Bonus:- " +e1.getBonus());
        System.out.println("Developer Bonus:- " +e2.getBonus());

    }
}