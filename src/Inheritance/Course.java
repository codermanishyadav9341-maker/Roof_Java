package Inheritance;

public class Course {
    String courseName;

    Course(String courseName){
        this.courseName = courseName;
    }

    public void showCourse(){
        System.out.println("Course Name:- " +courseName);
    }
}

class EnrolledStudent extends Course{
    String studentName;
    int roll;

    EnrolledStudent(String courseName,String studentName,int roll){
        super(courseName);
        this.studentName = studentName;
        this.roll = roll;
    }

    @Override
    public void showCourse(){
        super.showCourse();
        System.out.println("Student Name:- " +studentName);
        System.out.println("Roll Number:- " +roll);
    }

    public static void main(String[] args){
        Course cc = new EnrolledStudent("Java Programming","Manish Yadav",101);
        cc.showCourse();
    }
}