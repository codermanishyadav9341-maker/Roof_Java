package Else;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first angle:- ");
        int angle1st = scan.nextInt();

        System.out.print("Enter your Second angle:- ");
        int angle2nd = scan.nextInt();

        System.out.print("Enter your third angle:- ");
        int angle3rd = scan.nextInt();

        int sum_Of_angle = (angle1st+angle2nd+angle3rd);

        if(sum_Of_angle == 180){
            System.out.println(sum_Of_angle+ " This triangle is valid for 180");
        }
         else{
             System.out.println(sum_Of_angle+ " This triangle is not valid for 180");
        }
    }
}
