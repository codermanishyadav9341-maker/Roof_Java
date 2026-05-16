package Polymorphism;

public class Vehicle {

    public void displayInfo(){
        System.out.println("Generic Vehicle");
    }
}

class Car extends Vehicle{
    public void displayInfo(){
        System.out.println("Car : 4 Wheels");
    }
}

class Bike extends Vehicle{
    public void displayInfo(){
        System.out.println("Bike : 2 wheels");
    }

    public static void main(String[] args){
        Vehicle vv = new Vehicle();
        vv.displayInfo();

        Bike bb = new Bike();
        bb.displayInfo();

        Car cc = new Car();
        cc.displayInfo();


    }
}
