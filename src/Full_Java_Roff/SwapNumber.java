package Full_Java_Roff;
//
//import java.util.Scanner;
//
//public class SwapNumber {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        System.out.println("Before Swap:- ");
//        System.out.println("a:- " +a);
//        System.out.println("b:- " +b);
//
//        int temp;          // Using third Variable;
//        temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println("After Swap:- ");
//        System.out.println("a:- " +a);
//        System.out.println("b:- " +b);
//    }
//}

//
//import java.util.Scanner;
//
//public class SwapNumber{
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        System.out.println("Before Swap");
//        System.out.println("a:- " +a);
//        System.out.println("b:- " +b);
//
//
//        a = a+b;
//        b = a-b;      // Using without third Variable;
//        a = a-b;
//
//        System.out.println("After Swap");
//        System.out.println("a:- " +a);
//        System.out.println("b:- " +b);
//    }
//}



import java.util.Scanner;

public class SwapNumber{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.println("Before Swap");
        System.out.println("a:- " +a);
        System.out.println("b:- " +b);

        a = a^b;
        b = a^b;       // Bitwise Operators Swap;
        a = a^b;

        System.out.println("After Swap");
        System.out.println("a:- " +a);
        System.out.println("b:- " +b);
    }
}