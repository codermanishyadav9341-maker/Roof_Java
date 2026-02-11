package Full_Java_Roff;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        if(num >= 0){
            if(num > 0){
                System.out.println("Positive number is " +num);
            }
             else{
                 System.out.println("Zero is " +num);
            }
        }
         else{
             System.out.println("Negative number is " +num);
        }
    }
}
