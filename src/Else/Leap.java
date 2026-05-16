package Else;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Year:- ");
        int years = scan.nextInt();

        boolean result = ((years%4 == 0) && (years%100 != 0) && (years%400 == 0));

        if(result){
            System.out.println(years+ " is a Leap Years");
        }
         else{
             System.out.println(years+ " is not a Leap Years");
        }
    }
}
