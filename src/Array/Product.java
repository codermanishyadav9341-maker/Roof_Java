package Array;

import java.util.Scanner;

public class Product {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Array Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        int product = 1;

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Array elements:- ");
        for(int i = 0; i<size;  i++){
            System.out.println(arr[i]);
        }

        for(int i = 0; i<size; i++){
            product *= arr[i];
        }

        System.out.println("Product of Array elements:- " +product);
    }
}
