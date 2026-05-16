package Polymorphism1;

public class Student {

    public void printDetails(String name,int age){
        System.out.println("Student Name:- " +name);
        System.out.println("Age:- " +age);
    }

    public void printDetails(String name,int age, String course){
        System.out.println("Student Name:- " +name);
        System.out.println("Age:- " +age);
        System.out.println("Course:- " +course);
        System.out.println();
    }

    public static void main(String[] args){
        Student s1 = new Student();
        s1.printDetails("Manish Yadav",23);
        s1.printDetails("Jyoti Yadav",19,"BCA");


    }
}
