package Operators;

import java.util.Scanner;

public class OR_Bitwise {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        boolean result = ((a | b) != 0);
        System.out.println("OR Operators:- " +result);

    }
}
