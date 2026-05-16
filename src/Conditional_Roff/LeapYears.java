package Conditional_Roff;

import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Year's:- ");
        int years = scan.nextInt();

        boolean result = ((years%4 == 0) && (years%100 != 0) || (years%400 == 0));

        if(result){
            System.out.println(years+ " is a Leap Years");
        }
         else{
             System.out.println(years+ " is not Leap Years");
        }
    }
}
