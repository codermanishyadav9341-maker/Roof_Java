package Full_Java_Roff;
//
//import java.util.Scanner;
//
//public class Largest {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");     // Ternary Operators
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        System.out.println(a>b ? a: b);
//    }
//}


import java.util.Scanner;

public class Largest{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();                             // if else statements;

        if(a > b){
            System.out.println("Largest number is " +a);
        }
         else if(b > a){
             System.out.println("Largest number is " +b);
        }
    }
}