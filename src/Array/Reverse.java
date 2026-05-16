package Array;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Array Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];
        int rev;

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Array elements:- ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] +" ");
        }

        System.out.print("\nReverse elements:- ");
        for(int i = 0; i<size; i++){
             rev = arr[size - 1-i];
            System.out.print(rev + " ");
        }


    }
}
