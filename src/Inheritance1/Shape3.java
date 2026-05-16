package Inheritance1;

public class Shape3 {

    public void perimeter(){
        System.out.println("Calculating perimeters.............");
    }
}

class Square extends Shape3{
    double side;

    Square(double side){
        this.side = side;
    }

    @Override
    public void perimeter(){
        double square = 4*side;
        super.perimeter();
        System.out.println("Perimeters of Square:- " +square);
    }

    public static void main(String[] args){
        Shape3 ss = new Square(10);
        ss.perimeter();
    }
}
