package Conditional;

import java.util.Scanner;

public class Result{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Student Name:- ");
        String name = scan.nextLine();

        System.out.print("Enter your Chemistry Marks:- ");
        double chemistry_Marks = scan.nextDouble();

        System.out.print("Enter your Physics Marks:- ");
        double physics_Marks = scan.nextDouble();

        System.out.print("Enter your Maths Marks:- ");
        double maths_Marks = scan.nextDouble();

        double total_Marks = (chemistry_Marks + physics_Marks +maths_Marks);
        double percentage = (total_Marks)/3.0;


        System.out.println("---------------====:Report Card:====----------------");
        System.out.println("Student Name:- " +name);
        System.out.println("Chemistry Marks:- " +chemistry_Marks);
        System.out.println("Physics Marks:- " +physics_Marks);
        System.out.println("Maths Marks:- " +maths_Marks);
        System.out.println("Total Marks:- " +total_Marks);
        System.out.println("Percentage:- " +percentage) ;
        System.out.print("Grade:- ");

        if(percentage >= 90){
            System.out.println("1st Division");
        }
         else if(percentage >= 75){
             System.out.println("Second Division");
        }
          else if(percentage >= 65){
              System.out.println("3rd Division");
        }
           else{
               System.out.println("fail");
        }
    }
}