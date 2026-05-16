package Encapsulation;

public class Circle {
    private double radius;

//    Constructor;
  public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
      if(radius >= 0){
          this.radius = radius;
      }
       else{
           System.out.println("Radius must be Positive Cannot be negative");
      }
    }

    public double getRadius(){
      return radius;
    }

    public double getArea(){
      return 3.14*radius*radius;
    }

    public double getCircumference(){
      return 2*3.14*radius;
    }

    public double getDiameter(){
      return 2*radius;
    }

    public static void main(String[] args){
      Circle cc = new Circle(10);
      cc.setRadius(5);

      System.out.println("--------=:Circle:=-----------");
      System.out.println("Radius:- " +cc.getRadius());
      System.out.println("Area of Circle:- " +cc.getArea());
      System.out.println("Circumference of Circle:- " +cc.getCircumference());
      System.out.println("Diameters of Circle:- " +cc.getDiameter());

    }
}
