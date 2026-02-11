package Full_Java_Roff;

import java.util.Scanner;

public class Largest_3number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.print("Enter your third number:- ");
        int c = scan.nextInt();

        if((a > b) && (a > c)){
            System.out.println("Largest number is " +a);
        }
         else if((b > a) && (b > c)){
             System.out.println("Largest number is " +b);
        }
          else if((c > a) && (c > b)){
              System.out.println("Largest number is " +c);
        }
           else if((a == b) && (b == c)){
               System.out.println("three number are Equal");
        }
           else{
               System.out.println("equal");
        }
    }
}
