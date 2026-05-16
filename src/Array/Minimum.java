package Array;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Array Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Array elements:- ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]);
        }

        int min = arr[0];
        for(int i = 0; i<size; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("\nMinimum Value:- " +min);

    }
}
