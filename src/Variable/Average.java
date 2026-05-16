package Variable;

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        float a = scan.nextFloat();

        System.out.print("Enter your Second number:- ");
        float b = scan.nextFloat();

        System.out.print("Enter your Third,s number:- ");
        float c = scan.nextFloat();

        float avg = (a+b+c)/3.0F;

        System.out.println("Average Value:- " +avg);



    }
}
