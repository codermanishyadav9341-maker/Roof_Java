package Full_Java_Roff;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        int reverse = 0;

        while(num != 0){
            int digit = num%10;
            reverse = reverse*10+digit;
            num = num/10;
        }

        System.out.println("Reverse number:- " +reverse);
    }
}
