package Else;

import java.util.Scanner;

public class Side {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first angle:- ");
        int angle_1st = scan.nextInt();

        System.out.print("Enter your Second angle:- ");
        int angle_2nd = scan.nextInt();

        System.out.print("Enter your Third angle:- ");
        int angle_3rd = scan.nextInt();

        if((angle_1st == angle_2nd) && (angle_2nd == angle_3rd)){
            System.out.println("Equilateral triangle");
        }
         else if((angle_1st == angle_2nd) || (angle_2nd == angle_3rd) || (angle_1st == angle_3rd)){
             System.out.println("Isosceles triangle");
        }
          else{
              System.out.println("Scalene triangle");

        }

    }
}
