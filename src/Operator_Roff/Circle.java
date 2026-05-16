package Operator_Roff;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Radius:- ");
        int radius = scan.nextInt();

        double result = (22*radius*radius)/7;

        System.out.println("Area of Circle:-  " +result);

    }
}
