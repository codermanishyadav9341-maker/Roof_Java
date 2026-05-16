package Polymorphism;

public class Shape1 {
    public void printShape(){
        System.out.println("This is a Shape");
    }
}

class Square extends Shape1{

    @Override
    public void printShape(){
        System.out.println("This is a Square");
    }
}

class Triangle extends Shape1{

    @Override
    public void printShape(){
        System.out.println("This is a Triangle");
    }

    public static void main(String[] args){
        Shape1 ss = new Shape1();
        ss.printShape();

        Shape1 s1 = new Square();
        s1.printShape();

        Shape1 s2 = new Triangle();
        s2.printShape();

    }

}
