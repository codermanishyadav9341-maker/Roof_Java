package Inheritance1;

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
    double maths;
    double physics;
    double chemistry;

    MarkSheet(String name,double maths,double physics,double chemistry){
        super(name);
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    @Override
    public void display(){
        double total = (maths+physics+chemistry);
        super.display();
        System.out.println("Total Marks:- " +total);
    }

    public static void main(String[] args){
        Student1 s1 = new MarkSheet("Manish Kumar",75,89,90);
        s1.display();

    }
}