package Operators;

import java.util.Scanner;

public class NOT_Operation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("NOT Operations:- " +!(num != 0));
    }
}
