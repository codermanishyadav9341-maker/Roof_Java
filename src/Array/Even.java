package Array;

import java.util.Scanner;

public class Even {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Array Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Array elements:- ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] +" ");
        }


        for(int i = 0; i<size; i++){
            if(arr[i]%2 == 0){
                evenCount++;
            }

            if(arr[i]%2 != 0){
                oddCount++;
            }
        }

        System.out.println("\nEvenCount Digits:- " +evenCount);
        System.out.println("OddCount Digits:- " +oddCount);
    }
}
