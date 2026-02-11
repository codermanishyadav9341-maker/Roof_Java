package Conditional;

import java.util.Scanner;

public class Ascending_Order{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.print("Enter your Third number:- ");
        int c = scan.nextInt();

        System.out.print("Enter your fourth number:- ");
        int d = scan.nextInt();

        int temp;

        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }
         if(a > c){
             temp = a;
             a = c;
             c = temp;
         }

         if(a > d){
             temp = a;
             a = d;
             d = temp;
         }

         if(b > c){
             temp = b;
             b = c;
             c = temp;
         }

         if(b > d){
             temp = b;
             b = d;
             d = temp;
         }

         if(c > d){
             temp = c;
             c = d;
             d = temp;

         }

         System.out.print("Ascending Order:- " +a + " " +b+ " " +c+ " " +d);

    }
}