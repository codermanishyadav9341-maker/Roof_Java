package Variable1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.print("Enter your third number:- ");
        int c = scan.nextInt();

        float avg = (a+b+c)/3.0f;

        System.out.println("Average Value:- " +avg);

    }
}
