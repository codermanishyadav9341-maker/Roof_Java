package Conditional_Roff;

import java.util.Scanner;

public class Max {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        boolean result = ((a >= b));


        if(result){
            System.out.println(a+ " is Maximum number");
        }
         else{
             System.out.println(b+ " is Maximum number");
        }

    }
}
