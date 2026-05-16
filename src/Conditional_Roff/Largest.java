package Conditional_Roff;

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
            System.out.println(a+ " is a Largest number");
        }
          else if((b >= a) && (b >= c)){
              System.out.println(b+ " is a Largest number");
        }
           else{
               System.out.println(c+ " is a Largest number");
        }
    }
}
