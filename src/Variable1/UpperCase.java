package Variable1;
import java.util.Scanner;

import static java.lang.Character.*;

public class UpperCase {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Character:- ");
        char ch = scan.next().charAt(0);

        if(isLetter(ch)) {
            ch = toUpperCase(ch);
            System.out.println("UpperCase:- " + ch);
        } else {
            System.out.println("Please enter only alphabet!");
        }
    }
}