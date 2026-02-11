package Conditional;


import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first angle:- ");
        int angle1st = scan.nextInt();

        System.out.print("Enter your Second angle:- ");
        int angle2nd = scan.nextInt();

        System.out.print("Enter your Third angle:- ");
        int angle3rd = scan.nextInt();

        if((angle1st == angle2nd) && (angle2nd == angle3rd)){
            System.out.println("Equilateral triangle");
        }
         else if((angle1st == angle2nd) || (angle2nd == angle3rd) || (angle1st == angle3rd)){
             System.out.println("Isosceles triangle");
        }
          else{
              System.out.println("Scalene triangle");
        }
    }
}
