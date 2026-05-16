package Encapsulation;

public class Product {
    private int productID;
    private String name;
    private double price;
    private int quantity;

    Product(int productID,String name,double price,int quantity){
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

     public int getProductID(){
        return productID;
     }

     public String getName(){
        return name;
     }

     public double getPrice(){
        return price;
     }

     public int getQuantity(){
        return quantity;
     }


     public void setPrice(double price){
        if(price < 0){
            System.out.println("Price cannot be negative");
        }
         else{
             this.price = price;
        }
     }

     public void addStock(int amount){
        if(amount > 0){
            this.quantity += amount;
        }
         else{
             System.out.println("Amount cannot be negative");
        }
     }

    public void sellProduct(int amount){
        if(amount < 0){
            System.out.println("Amount must be Positive");
        }
           else if(amount > quantity){
               System.out.println("No enough Product");
        }
           else{
            this.quantity -= amount;
        }
    }

    public double getTotalValue(){
        return price*quantity;
    }

    public boolean getIsStock(){
        return quantity > 0;
    }

    public static void main(String[] args){
        Product pp = new Product(104,"kurkure",45,55);
        pp.setPrice(25);
        pp.addStock(100);
        pp.sellProduct(90);


        
        System.out.println("--------------------=:Product Details:=-------------------");
        System.out.println("Product ID:- " +pp.getProductID());
        System.out.println("Product Name:- " +pp.getName());
        System.out.println("Price:- " +pp.getPrice());
        System.out.println("Quantity:- " +pp.getQuantity());
        System.out.println("Total Value:- " +pp.getTotalValue());
        System.out.println("Stock Available:- " +pp.getIsStock());



    }
}
