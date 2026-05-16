package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Array Size:- ");
        int size = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for (int i = 0; i < size; i++) {
            list.add(scan.nextInt());
        }

        System.out.print("Array elements:- ");
        System.out.print(list + "\n");

        System.out.print("Searching elements:- ");
        int search = scan.nextInt();

        if (list.contains(search)) {
            int index = list.indexOf(search);
            System.out.println("Elements Present in Array index no." + index);
        } else {
            System.out.println("Elements is not Present in Array");
        }


    }
}