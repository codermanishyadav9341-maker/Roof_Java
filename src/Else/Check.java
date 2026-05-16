package Else;

import java.util.Scanner;

public class Check {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Characters:- ");
        char ch = scan.next().charAt(0);

        if((ch >= 'A') && (ch <= 'Z') || (ch >= 'a') && (ch <= 'z')){
            System.out.println(ch+ " is Alphabets");
        }
        else if(ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9'){
             System.out.println(ch+ " is a number");
        }
          else{
              System.out.println(ch+ " is a Special Characters");
        }
    }
}
