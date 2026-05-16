package Variable1;

import java.util.Scanner;

public class Product {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        float a = scan.nextFloat();

        System.out.print("Enter your  Second number:- ");
        float b = scan.nextFloat();

        float product = (a*b);

        System.out.println("Product of two number is:- " +product);


    }
}
