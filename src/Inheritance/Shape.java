package Inheritance;

public class Shape {

    public void area(){
        System.out.println("Calculating area.......");
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public void area(){
        double rectangle = (length*breadth);
        System.out.println("Area of Rectangle:- " +rectangle);
    }

    public static void main(String[] args){
        Shape rr = new Rectangle(10,20);
        rr.area();
    }
}
