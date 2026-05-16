package Inheritance;

public class Shape1 {

    public void perimeters(){
        System.out.println("Calculating perimeters:- ");
    }
}

class Square extends Shape1{
    double side;

    Square(double side){
        this.side = side;
    }

    @Override
    public void perimeters(){
        double square = 4*side;
        System.out.println("Perimeters of Square:- " +square);
    }

    public static void main(String[] args){
        Shape1 ss = new Square(10);
        ss.perimeters();
    }

}
