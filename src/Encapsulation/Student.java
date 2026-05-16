package Encapsulation;

public class Student {
    private String name;
    private int rollNumber;
    private double mathGrade;
    private double scienceGrade;
    private double englishGrade;

    Student(String name,int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void setMathGrade(double mathGrade){
        if(mathGrade >= 0 && mathGrade <= 100){
            this.mathGrade = mathGrade;
        }
         else{
             System.out.println("MathGrade must be Positive cannot be negative");
        }
    }

    public void setScienceGrade(double scienceGrade){
        if(scienceGrade >= 0 && scienceGrade <= 100){
            this.scienceGrade = scienceGrade;
        }
         else{
             System.out.println("ScienceGrade must be positive cannot be negative");
        }
    }


    public void setEnglishGrade(double englishGrade){
        if(englishGrade >= 0 && englishGrade <= 100){
            this.englishGrade = englishGrade;
        }
         else{
             System.out.println("EnglishGrade must be positive cannot be negative");
        }
    }

    public String getName(){
        return name;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public double getMathGrade(){
        return mathGrade;
    }

    public double getScienceGrade(){
        return scienceGrade;
    }

    public double getEnglishGrade(){
        return englishGrade;
    }

    public double getTotalMarks(){
        return mathGrade+scienceGrade+englishGrade;
    }
    public double getAverageGrade(){
        return getTotalMarks()/3.0;
    }

    public String getLetterGrade(){
        double avg = getAverageGrade();
        if(avg >= 90) return "A";
         if(avg >= 80) return "B";
         if(avg >= 70) return "C";
         if(avg >= 60) return "D;";
         return "fail";
    }

    public static void main(String[] args){
        Student ss = new Student("Manish Yadav",25502001);
        ss.setMathGrade(90);
        ss.setScienceGrade(85);
        ss.setEnglishGrade(96);

        System.out.println("------------------=:Student Details:=--------------------");
        System.out.println("Student Name:- " +ss.getName());
        System.out.println("Roll Number:- " +ss.getRollNumber());
        System.out.println("Maths Marks:- " +ss.getMathGrade());
        System.out.println("Science Marks:- " +ss.getScienceGrade());
        System.out.println("English Marks:- " +ss.getEnglishGrade());
        System.out.println("Marks Obtained:- " +ss.getTotalMarks());
        System.out.println("Percentage:- " +ss.getAverageGrade()+ "%");
        System.out.println("Grade:- " +ss.getLetterGrade());

    }
}
