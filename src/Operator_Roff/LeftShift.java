package Operator_Roff;

import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.print("Enter your Shift Power:- ");
        int shift = scan.nextInt();

        int result = num << shift;

        System.out.println("Left Shift Value is:- " +result);

    }
}
