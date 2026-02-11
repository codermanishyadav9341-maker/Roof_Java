package Conditional;

import java.util.Scanner;

public class Multiple_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        if(num%3 == 0){
            System.out.println(num+ " is divisible by 3");
        }
         else{
             System.out.println(num+ " is not divisible by 3");
        }
    }
}
