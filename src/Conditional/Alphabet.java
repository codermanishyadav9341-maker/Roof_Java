package Conditional;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Characters:- ");
        char ch = scan.next().charAt(0);

        if((ch >= 'A') && (ch <= 'Z') || (ch >= 'a') && (ch <= 'z')){
            System.out.println("Alphabet is " +ch);
        }
         else{
             System.out.println("No Alphabet");
        }
    }
}
