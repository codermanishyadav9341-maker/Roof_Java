package Conditional;

import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Years:- ");
        int years = scan.nextInt();

        if(years%4 == 0){
            if(years%100 != 0){
                System.out.println(years+ " is Leap Years");
            }
             else if(years%400 == 0){
                 System.out.println(years+ " is Leap years");
            }
              else{
                  System.out.println(years+ " is not leap Years");
            }
        }
        else{
            System.out.println(years+ " is not leap Years");
        }
    }
}
