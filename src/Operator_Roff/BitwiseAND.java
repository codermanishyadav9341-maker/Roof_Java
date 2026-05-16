package Operator_Roff;

import java.util.Scanner;

public class BitwiseAND {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        int result = (a & b);

        System.out.println("Bitwise AND Operators:- " +result);


    }
}
