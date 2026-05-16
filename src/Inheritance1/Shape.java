package Inheritance1;

public class Shape {

    public void area(){
        System.out.println("Calculating area.................");
    }
}

class Rectangle extends Shape{
    double length;
    double breath;

    Rectangle(double length,double breath){
        this.length = length;
        this.breath = breath;
    }

    @Override
    public void area(){
        double rectangle = (length*breath);
        System.out.println("Area of Rectangle:- " +rectangle);
    }

    public static void main(String[] args){
        Shape ss = new Shape();
        Shape s1 = new Rectangle(10,5);
        ss.area();
        s1.area();

    }
}