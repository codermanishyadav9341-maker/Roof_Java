package Operators;

import java.util.Scanner;

public class XOR_Operator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.println("Before Swap:- ");
        System.out.println("a:- " +a);
        System.out.println("b:- " +b);

//         XOR Operators;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After Swap:- ");
        System.out.println("a:- " +a);
        System.out.println("b:- " +b);
    }
}
