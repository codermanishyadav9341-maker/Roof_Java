package Conditional_Roff;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Cost Price:- ");
        double cost_Price = scan.nextDouble();

        System.out.print("Enter your Selling Price:- ");
        double selling_Price = scan.nextDouble();

        double profit;
        double loss;

        if(selling_Price >= cost_Price){
            profit = (selling_Price - cost_Price);
            System.out.println("Profit:- " +profit);
        }
         else if(cost_Price > selling_Price){
             loss = (cost_Price - selling_Price);
             System.out.println("Loss:- " +loss);
        }
          else{
              System.out.println("Both are equal");
        }

    }
}
