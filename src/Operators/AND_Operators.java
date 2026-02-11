package Operators;

import java.util.Scanner;

public class AND_Operators {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

       if((a != 0) && (b != 0)){
           System.out.println("Logical AND Operator:- " +((a != 0) && (b != 0)));
       }
        else{
            System.out.println("Its not AND Operator:- " +((a != 0) && (b != 0)));
       }
    }
}
