package Inheritance1;

public class Course1 {
    String courseName;

    Course1(String courseName){
        this.courseName = courseName;
    }

    public void showCourse(){
        System.out.println("Course Name:- " +courseName);
    }
}

class EnrolledStudent extends Course1{
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
        System.out.println("Roll number:- " +roll);
    }

    public static void main(String[] args){
        Course1 cc = new EnrolledStudent("Java Developer","Manish Yadav",101);
        cc.showCourse();
    }
}
