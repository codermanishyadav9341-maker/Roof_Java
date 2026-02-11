package Conditional;

import java.util.Scanner;

public class Divisible_5_11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        if((num%5 == 0) && (num%11 == 0)){
            System.out.println(num+ " is divisible by 5 or 11");
        }
         else{
             System.out.println(num+ " is not divisible by 5 or 11");
        }
    }
}
