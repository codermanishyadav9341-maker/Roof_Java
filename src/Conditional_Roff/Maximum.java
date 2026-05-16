package Conditional_Roff;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        if(a == b){
            System.out.println("Both are Equal");
        }
         else if(a > b){
             System.out.println(a+ " is a Maximum number");
        }
         else{
             System.out.println(b+ " is a Maximum number");
        }
    }
}
