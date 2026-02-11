package Conditional;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first angle:- ");
        int angle1st = scan.nextInt();

        System.out.print("Enter your Second angle:- ");
        int angle2nd = scan.nextInt();

        System.out.print("Enter your Thirds angle:- ");
        int angle3rd = scan.nextInt();

        int sum_Of_allAngle = (angle1st +angle2nd +angle3rd);

        if(sum_Of_allAngle == 180){
            System.out.println("this triangle is valid");
        }
         else{
             System.out.println("This triangle is not valid");
        }
    }
}
