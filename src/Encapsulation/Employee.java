package Encapsulation;

public class Employee {
    private String name;
    private int employeeID;
    private double salary;
    private double bonus;

    Employee(String name,int employeeID,double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.bonus = 0;
    }

    public String getName(){
        return name;
    }

    public int getEmployeeID(){
        return employeeID;
    }

    public double getSalary(){
        return salary;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        if(bonus < 0){
            System.out.println("Bonus cannot be negative");
        }
         else {
             this.bonus = bonus;
        }
    }

    public double getTotalPay(){
        return salary + bonus;
    }

    public void giveRise(double percentage){
        if(percentage > 0){
            salary += salary*percentage/100;
        }
    }

    public static void main(String[] args){
        Employee ee = new Employee("Manish Yadav",104,45000);
        ee.setBonus(500);
        ee.giveRise(5);

        System.out.println("----------------=:Employee Details:=-----------------");
        System.out.println("Employee Name:- " +ee.getName());
        System.out.println("EmployeeID:- " +ee.getEmployeeID());
        System.out.println("Salary:- " +ee.getSalary());
        System.out.println("Bonus:- " +ee.getBonus());
        System.out.println("Total Salary:- " +ee.getTotalPay());
    }
}
