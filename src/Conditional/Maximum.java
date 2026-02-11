package Conditional;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        if(a > b){
            System.out.println("Maximum number is " +a);
        }
         else if(b > a){
             System.out.println("Maximum number is " +b);
        }
          else{
              System.out.println("Both are equal");
        }
    }
}
