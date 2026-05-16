package Conditional_Roff;

import java.util.Scanner;

public class Divisible1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        if((num%3 == 0) && (num%5 == 0)){
            System.out.println(num+ " is Divisible by 3 or 5");
        }
         else{
             System.out.println(num+ " is not Divisible by 3 or 5");
        }

    }
}
