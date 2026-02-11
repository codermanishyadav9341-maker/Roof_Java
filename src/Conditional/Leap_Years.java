package Conditional;

import java.util.Scanner;

public class Leap_Years {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Years:- ");
        int years = scan.nextInt();

        boolean result = ((years%4 == 0) && (years%100 != 0) || (years%400 == 0));
        System.out.print("Leap Years:- "+result);

    }
}
