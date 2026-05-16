package Inheritance1;

public class School {
    String schoolName;

    School(String schoolName){
        this.schoolName = schoolName;
    }

    public void showSchool(){
        System.out.println("School Name:- " +schoolName);
    }
}

class Teacher extends School{
    String teacherName;

    Teacher(String schoolName,String teacherName){
        super(schoolName);
        this.teacherName = teacherName;
    }

    public void showTeacherDetails(){
        super.showSchool();
        System.out.println("Teacher Name:- " +teacherName);
    }

    public static void main(String[] args){
       Teacher sc = new Teacher("Coding Age","Gaurav Kasyap");
        sc.showTeacherDetails();
    }
}
