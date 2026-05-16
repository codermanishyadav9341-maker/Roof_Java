package Variable1;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.println("Before Swap");
        System.out.println("a = " +a+ "  b = " +b);
        int temp = a;
        a = b;
        b = temp;


        System.out.println("After Swap");
        System.out.println("a = " +a+ "  b = " +b);


    }
}
