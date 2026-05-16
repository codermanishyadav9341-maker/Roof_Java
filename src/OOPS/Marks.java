package OOPS;

import OOPS.Student;
public class Marks {
    public static void main(String[] args){
       Student ss = new Student("Manish Yadav",255046,89,95,78);

       System.out.println("--------------========:REPORT CARD:=========----------------");
       System.out.println("Student Name:- " +ss.getName());
       System.out.println("Roll Number:- " +ss.getRollNumber());
       System.out.println("Maths Marks:- " +ss.getMathMarks());
       System.out.println("Science Marks:- " +ss.getScienceMarks());
       System.out.println("English Marks:- " +ss.getEnglishMarks());
       System.out.println("Marks Obtain:- " +ss.getTotalMarks());
       System.out.println("Percentage:- " +ss.getAverage());
       System.out.println("Grade:- " +ss.getGrade());

    }
}
