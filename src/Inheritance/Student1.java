package Inheritance;

public class Student1 {
    String name;

    Student1(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("Student Name:- " +name);
    }
}

class MarkSheet extends Student1{
    double physics;
    double maths;
    double chemistry;

    MarkSheet(String name,double physics,double maths,double chemistry){
        super(name);
        this.physics = physics;
        this.maths = maths;
        this.chemistry = chemistry;
    }

    public double calculateMarks(){
        return physics+chemistry+maths;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Total Marks:- " +calculateMarks());
    }

    public static void main(String[] args){
        Student1 ss = new MarkSheet("Manish Kumar",85,79,96);
        ss.display();

    }
}