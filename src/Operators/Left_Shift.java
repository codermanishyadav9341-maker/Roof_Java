package Operators;

import java.util.Scanner;

public class Left_Shift {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.print("Enter your Shift:- ");
        int shift = scan.nextInt();

        System.out.println("Left Shift:- " +(num << shift));

    }
}
