package Polymorphism;

public class AreaCalculator {

    public double area(double radius){
        return 3.14*radius*radius;
    }

    public int area(int length ,int breath){
        return length*breath;
    }

    public double area(double base, double height){
        return   0.5*base*height;
    }

    public static void main(String[] args){
        AreaCalculator aa = new AreaCalculator();


        System.out.println("Area of Circle:- " +aa.area(2.5));
        System.out.println("Area of Rectangle:- " +aa.area(10,5));
        System.out.println("Area of Triangle:- " +aa.area(2.5,6));

    }
}
