package Variable;

import java.util.Scanner;

public class Swap1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.println("Before Swap:-  ");
        System.out.println("a = " +a+ "   b = " +b);

        System.out.println("After Swap:- ");
         a = a+b;
         b = a-b;
         a = a-b;

         System.out.println("a = " +a+ "  b = " +b);

    }
}
