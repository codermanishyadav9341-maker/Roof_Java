package Abstraction;

abstract class Shape{
    String name;

    Shape(String name){
        this.name = name;
    }

    abstract  double area();

    public String toString(){
        return "Shape:- " +name+ "Area:- " +area();
    }
}

class Circle extends Shape{
    double radius;

    Circle(String name,double radius){
        super(name);
        this.radius = radius;
    }

    double area(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    double length;
    double breath;

    Rectangle(String name,double length,double breath){
        super(name);
        this.length = length;
        this.breath = breath;
    }

    double area(){
        return length*breath;
    }

    public static void main(String[] args){
        Shape s1 = new Circle("Circle ",10);
        Shape s2 = new Rectangle("Rectangle ",10,5);

        System.out.println(s1);
        System.out.println(s2);

    }
}

