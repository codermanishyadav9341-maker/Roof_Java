package Conditional_Roff;

import java.util.Scanner;

public class Even1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        boolean result = (num%2 == 0);

        if(result){
            System.out.println(num+ " is even number");
        }
         else{
             System.out.println(num+ " is odd number");
        }
    }
}
