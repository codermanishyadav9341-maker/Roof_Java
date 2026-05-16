package Variable;

import java.util.Scanner;

public class Product {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        float a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        float b = scan.nextInt();

        float result = a*b;

        System.out.println("Product:- " +result);

    }
}
