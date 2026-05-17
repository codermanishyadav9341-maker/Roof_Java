package Polymorphism_Practice;

public class Student {

    Student(){
        System.out.println("Default Value");
    }

    Student(String name){
         System.out.println(name);
    }

    public static void main(String[] args){

        Student ss = new Student();
        Student s1 = new Student("Manish");

    }
}
