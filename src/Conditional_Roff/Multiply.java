package Conditional_Roff;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        if(num%3 == 0){
            System.out.println(num+ " is Multiple by 3");
        }
         else{
             System.out.println(num+ " is not Multiple by 3");
        }
    }
}
