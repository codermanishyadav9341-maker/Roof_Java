package Variable;

import java.util.Scanner;

public class Char_Value {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Characters:- ");
        char ch = scan.next().charAt(0);

        System.out.println("Words:- " +ch);
    }
}
