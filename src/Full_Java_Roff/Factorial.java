package Full_Java_Roff;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        int factorial = 1;
        for(int i = 2; i<=num; i++){
            factorial *= i;
        }
        System.out.println("Factorial is:- " +factorial);
    }
}
