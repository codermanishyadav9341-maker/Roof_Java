package Conditional;

import java.util.Scanner;



public class Maximum1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        int maximum = (a>b) ? a: b;

        System.out.println("Maximum number is " +maximum);

    }
}
