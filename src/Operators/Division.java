package Operators;

import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your second number:- ");
        int b = scan.nextInt();

        int result = (a/b);

        System.out.println("Division:- " +result);

    }
}
