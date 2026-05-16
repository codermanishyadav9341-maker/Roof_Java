package Inheritance;

public class Person {
    public void showDetails(){
        System.out.println("Person Details");
    }
}
class Student extends Person{

    @Override
    public void showDetails(){
        System.out.println("Student Details");
    }

    public static void main(String[] args){
        Person pp = new Student();
        pp.showDetails();
    }
}