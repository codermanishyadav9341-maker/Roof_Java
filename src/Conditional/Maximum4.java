package Conditional;


import java.util.Scanner;

public class Maximum4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.print("Enter your Third number:- ");
        int c = scan.nextInt();

        System.out.print("Enter your Fourth number:- ");
        int d = scan.nextInt();

        if((a >= b) && (a >= c) && (a >= d)){
            System.out.println("Largest number is " +a);
        }
         else if((b >= a) && (b >= c) && (b >= d)){
             System.out.println("Largest number is " +b);
        }
          else if((c >= a) && (c >= b) && (c >= d)){
              System.out.println("Largest number is " +c);
        }
           else{
               System.out.println("Largest number is " +d);
        }

    }
}
