package Conditional_Roff;

import java.util.Scanner;

public class Maximum1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.print("Enter your Third number:- ");
        int c = scan.nextInt();

        System.out.print("Enter your fourth number:- ");
        int d = scan.nextInt();

        if((a >= b) && (a >= c) && (a >= d)){
            System.out.print(a+ " is a Maximum number");
        }
         else if((b >= a) && (b >= c) && (b >= d)){
             System.out.print(b+ " is a Maximum number");
        }
          else if((c >= a) && (c >= b) && (c >= d)){
              System.out.println(c+ " is a Maximum number");
        }
          else if((d >= a) && (d >= b) && (d >= c)){
              System.out.println(d+ " is a Maximum number");
        }
           else{
               System.out.println("All number are equal");
        }
        scan.close();
    }
}
