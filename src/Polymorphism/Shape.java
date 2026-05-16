package Polymorphism;

public class Shape {
    public void draw(){
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing circle");
    }

    public void draw(int radius){
        System.out.println("Drawing Circle with Radius:- " +radius);
    }
}

class Rectangle extends Shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }

    public static void main(String[] args){
        Shape ss = new Shape();
        ss.draw();

        Circle cc = new Circle();
        cc.draw();
        cc.draw(10);

        Rectangle rr = new Rectangle();
        rr.draw();

    }
}
