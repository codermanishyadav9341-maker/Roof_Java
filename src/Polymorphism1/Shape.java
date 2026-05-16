package Polymorphism1;

public class Shape {

    public void draw(){
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape{

    @Override
    public void draw(){
        System.out.println("Drawing Circle");
    }

    public void draw(int radius){
        System.out.println("Drawing of Circle with Radius:- " +radius);
    }
}

class Rectangle extends Shape{

    @Override
    public void draw(){
        System.out.println("Drawing Rectangle");
    }

    public static void main(String[] args){
        Shape ss = new Shape();
        Circle s1 = new Circle();
        Shape s2 = new Rectangle();

        ss.draw();
        s1.draw();
        s1.draw(10);
        s2.draw();
    }
}