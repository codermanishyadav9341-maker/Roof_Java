package Conditional;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.print("Enter your Third number:- ");
        int c = scan.nextInt();

        if((a >= b) && (a >= c)){
            System.out.println("Largest number is " +a);
        }
         else if((b >= a) && (b >= c)){
             System.out.println("Largest number is "+b);
        }
          else{
              System.out.println("Largest number is " +c);
        }

        }
}
