package Else;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Characters:- ");
        char ch = scan.next().charAt(0);

        if((ch >= 'A') && (ch <= 'Z') || (ch >= 'a') && (ch <= 'z')){
            System.out.println(ch+ " is Alphabets");
        }
         else{
             System.out.println(ch+ " is not Alphabets");
        }
    }
}
