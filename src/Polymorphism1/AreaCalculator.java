package Polymorphism1;

public class AreaCalculator {

      public void area(int radius){
          double circle = 3.14*radius*radius;
          System.out.println("Area of Circle:- " +circle);
      }

      public void area(int length,int breath){
          int rectangle = length*breath;
          System.out.println("Area of Rectangle:- " +rectangle);
      }

      public void area(double base,double height){
          double triangle = 0.5*base*height;
          System.out.println("Area of triangle:- " +triangle);
      }

      public static void main(String[] args){
          AreaCalculator cc = new AreaCalculator();
          cc.area(5);
          cc.area(10,2);
          cc.area(1.5,10);

      }
}
