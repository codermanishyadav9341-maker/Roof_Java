package Conditional_Roff;

import java.util.Scanner;

public class Result {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Student Name:- ");
        String str = scan.nextLine();

        System.out.print("Enter Physics Marks:- ");
        double physics = scan.nextDouble();

        System.out.print("Enter Chemistry Marks:- ");
        double chemistry = scan.nextDouble();

        System.out.print("Enter Maths Marks:- ");
        double maths = scan.nextDouble();

        System.out.print("Enter English Marks:- ");
        double english = scan.nextDouble();

        System.out.print("Enter Hindi Marks:- ");
        double hindi = scan.nextDouble();

        double total_Marks = (physics+chemistry+maths+english+hindi);

        System.out.println("-----------------=:Report Card:=------------------");
        System.out.println("Student Name:- " +str);
        System.out.println("Physics Marks:- " +physics);
        System.out.println("Chemistry Marks:- " +chemistry);
        System.out.println("Maths Marks:- " +maths);
        System.out.println("English Marks:- " +english);
        System.out.println("Hindi Marks:- " +hindi);
        System.out.println("Marks Obtained:- " +total_Marks);
        System.out.print("Grade:- " );

        if(total_Marks >= 300){
            System.out.println("1st Division");
        }
         else if(total_Marks >= 240){
             System.out.println("2nd Division");
        }
          else if(total_Marks >= 180){
              System.out.println("3rd Division");
        }
           else{
               System.out.println("fails");
        }
    }
}
