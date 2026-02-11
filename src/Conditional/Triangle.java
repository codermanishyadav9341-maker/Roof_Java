package Conditional;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first angle:- ");
        int angle_1st = scan.nextInt();

        System.out.print("Enter your Second angle:- ");
        int angle_2nd = scan.nextInt();

        System.out.print("Enter your Third angle:- ");
        int angle_3rd = scan.nextInt();

        int sum_Of_All_Angle = (angle_1st + angle_2nd + angle_3rd);

        if(sum_Of_All_Angle == 180){
            System.out.println("This triangle is valid for " +sum_Of_All_Angle);
        }
         else{
             System.out.println("This triangle is not valid for " +sum_Of_All_Angle);
        }
    }
}
