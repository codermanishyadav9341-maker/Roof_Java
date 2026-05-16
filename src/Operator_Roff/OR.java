package Operator_Roff;

import java.util.Scanner;

public class OR {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        boolean result = ((a != 0) || (b != 0));
        System.out.println("OR Operators Logic Checks:- " +result);

    }
}
