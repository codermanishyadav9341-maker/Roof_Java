package Inheritance;

public class Food {
    String foodName;

    Food(String foodName){
        this.foodName = foodName;
    }

    public void display(){
        System.out.println("Food Name:- " +foodName);
    }
}

class Desert extends Food{
    String sweetnessLevel;

    Desert(String foodName,String sweetnessLevel){
        super(foodName);
        this.foodName = foodName;
    }

    public void display() {
        super.display();
        System.out.println("SweetnessLevel:- " + sweetnessLevel);
    }

    public static void main(String[] args){
        Food ff = new Desert("Gulab Jamun","High");
        ff.display();
    }
}