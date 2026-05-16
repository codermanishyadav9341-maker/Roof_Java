package Conditional_Roff;

import java.util.Scanner;

public class Sort_Ascending_Order {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter Second number:- ");
        int b = scan.nextInt();

        System.out.print("Enter Third number:- ");
        int c = scan.nextInt();

        int temp;

        if(a >= b){
            temp = a;
            a = b;
            b = temp;
        }

        if(a >= c){
            temp = a;
            a = c;
            c = temp;
        }

        if(b >= c){
            temp = b;
            b = c;
            c = temp;
        }


        System.out.println("Ascending Order:- " +a+ " " +b+ " " +c);


    }
}
