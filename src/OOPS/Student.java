package OOPS;

public class Student {
    private String name;
    private int rollNumber;
    private double mathMarks;
    private double scienceMarks;
    private double englishMarks;


//    Constructor

    Student(String name,int rollNumber,double mathMarks , double scienceMarks,double englishMarks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        this.englishMarks = englishMarks;
    }


//     Setter
    public void setMathMarks(){
        if(mathMarks >= 0 && mathMarks < 100){
            this.mathMarks = mathMarks;
        }
         else{
             System.out.println("Marks Cannot be negative");
        }
    }

    public void setScienceMarks(){
        if(scienceMarks >= 0 && scienceMarks < 100){
            this.scienceMarks = scienceMarks;
        }
         else{
            System.out.println("Marks Cannot be negative");
        }
    }

    public void setEnglishMarks(){
        if(englishMarks >= 0 && englishMarks < 100){
            this.englishMarks = englishMarks;
        }
         else{
            System.out.println("Marks Cannot be negative");
        }
    }


//     Getter

    public String getName(){
        return name;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public double getMathMarks(){
        return mathMarks;
    }

    public double getScienceMarks(){
        return scienceMarks;
    }

    public double getEnglishMarks(){
        return englishMarks;
    }

    public double getTotalMarks(){
        return (mathMarks+scienceMarks+englishMarks);
    }

    public double getAverage(){
        return (mathMarks+scienceMarks+englishMarks)/3.0;
    }

    public String getGrade(){
        double avg = getAverage();
        if(avg >= 90) return "A";
        else if(avg >= 80) return "B";
        else if(avg >= 70) return "C";
        else if(avg >= 60) return "D";
        else return "fail";
    }
}
