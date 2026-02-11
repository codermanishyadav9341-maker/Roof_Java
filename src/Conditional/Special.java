package Conditional;


import java.util.Scanner;

public class Special {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Characters:- ");
        char ch = scan.next().charAt(0);

        if((ch >= 'A') && (ch <= 'Z') || (ch >= 'a') && (ch <= 'z')){
            System.out.println("Alphabets");
        }
         else if((ch >= '0') && (ch <= '9')){
             System.out.println("Digit is " +ch);
        }
          else{
              System.out.println("Special Characters " +ch);
        }

    }
}
