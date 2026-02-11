package Full_Java_Roff;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        int sum = a+b;

        System.out.print("Sum of two number:- " +sum);

    }
}
