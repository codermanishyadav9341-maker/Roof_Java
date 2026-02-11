package Conditional;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Cost Price:- ");
        double cost_Price = scan.nextDouble();

        System.out.print("Enter your Selling Price:- ");
        double selling_Price = scan.nextDouble();

        if(selling_Price >= cost_Price){
            double profit = (selling_Price - cost_Price);
            System.out.println("Profit is " +profit);
        }
         else if(cost_Price > selling_Price){
             double loss = (cost_Price - selling_Price);
             System.out.println("Loss is " +loss);
        }
          else{
              System.out.println("Profit and loss are equal");
        }
    }
}
