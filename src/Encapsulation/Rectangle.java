package Encapsulation;

public class Rectangle {
    private double length;
    private double breadth;

    Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(){
       if(length != 0){
           this.length = length;
       }
        else{
            System.out.println("Length must be Positive Cannot be negative");
       }
    }

    public double getLength(){
        return length;
    }

    public void setBreadth(){
       if(breadth != 0){
           this.breadth = breadth;
       }
        else{
            System.out.println("Breadth must be Positive Cannot be negative");
       }
    }

    public double getBreadth(){
        return breadth;
    }

    public double getArea(){
        return length*breadth;
    }

    public double getPerimeter(){
        return 2*(length+breadth);
    }

    public boolean getIsSquare(){
        return length == breadth;
    }

    public static void main(String[] args){
        Rectangle rr = new Rectangle(10,5);

        System.out.println("--------------=:Rectangle Details:=-------------------");
        System.out.println("Area of Rectangle:- " +rr.getArea());
        System.out.println("Perimeters of Rectangle:- " +rr.getPerimeter());
        System.out.println("Side are equal:- " +rr.getIsSquare());
    }
}
