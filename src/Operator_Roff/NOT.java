package Operator_Roff;

import java.util.Scanner;

public class NOT {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        boolean result = (num != 0);

        System.out.println("Original Value:- " +result);
        System.out.println("NOT Operators:- " +!result);

    }
}
