package Polymorphism_Practice;

public class Area {

    public void area(double radius){
        double result = Math.PI*radius*radius;
        System.out.println("Area of Square:- " +result);
    }

    public void area(int length,int breath){
        int result = length * breath;
        System.out.println("Area of Rectangle:- " +result);
    }

    public static void main(String[] args){
        Area area = new Area();
        area.area(10);
        area.area(10,5);
    }
}
