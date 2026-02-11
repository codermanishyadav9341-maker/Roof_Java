package Conditional;

import java.util.Scanner;

public class Positive1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int num = scan.nextInt();

        if(num >= 0){
            if(num > 0){
                System.out.println("Positive number is " +num);
            }
             else{
                 System.out.println("Zero is " +num);
            }
        }
         else{
             System.out.println("Negative number is " +num);
        }


    }
}
