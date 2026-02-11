package Operators;

import java.util.Scanner;

public class Increment {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        int result = num++ + ++num + num++ + ++num + num++;

        System.out.println("Increments:- " +result);
    }
}
