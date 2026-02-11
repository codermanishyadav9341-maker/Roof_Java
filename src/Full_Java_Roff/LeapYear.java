package Full_Java_Roff;
//
//import java.util.Scanner;
//
//public class LeapYear {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your years:- ");
//        int years = scan.nextInt();                       // if - else Statements
//
//        if((years%4 == 0) && ((years%100) != 0) || (years%400 == 0) ){
//            System.out.println("Leap Years is " +years);
//        }
//         else{
//             System.out.println("It is not Leap Years is " +years);
//        }
//    }
//}


//
//import java.util.Scanner;
//
//public class LeapYear{
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Years:- ");
//        int years = scan.nextInt();
//
//        if(years%4 == 0){
//            if(years%100 != 0){
//                System.out.println("Leap Years is " +years);
//            }                                                    // nested if - else Statements ;
//             else if(years%400 == 0){
//                 System.out.println("Leap Years is " +years);
//            }
//              else{
//                  System.out.println("Not Leap Years is " +years);
//            }
//        }
//         else{
//            System.out.println("Not Leap Years is " +years);
//        }
//
//    }
//}


import java.util.Scanner;

   public class LeapYear{
       public static void main(String[] args){
           Scanner scan = new Scanner(System.in);

           System.out.print("Enter your Years:- ");       // Ternary Operators;
           int years = scan.nextInt();

           boolean leap = ((years%4 == 0) && (years%100 != 0) || (years%400 == 0));
               System.out.println("Leap Years:- " +leap);

       }
   }

