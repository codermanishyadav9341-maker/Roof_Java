package Operator;

import java.util.Scanner;

public class Add {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.println("Add.:- " +(a+b));
        System.out.println("Substraction.:- " +(a-b));
        System.out.println("Product.:- " +(a*b));
        System.out.println("Division:- " +(a/b));
        System.out.println("Remainder:- " +(a%b));
    }
}
