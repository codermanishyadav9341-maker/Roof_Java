package Operator_Roff;

import java.util.Scanner;

public class Increments {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int a = scan.nextInt();

        int result = a++ + ++a + a++;

        System.out.println("Increments of a is:- " +result);

    }
}
