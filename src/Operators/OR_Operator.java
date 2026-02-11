package Operators;

import java.util.Scanner;

public class OR_Operator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.println("OR Operator:- " +((a != 0) || (b != 0)));


    }
}
