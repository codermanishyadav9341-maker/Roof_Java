package Polymorphism1;

public class Vehicle {

    public void displayInfo(){
        System.out.println("Generic Vehicle");
    }
}

class Car extends Vehicle{

    public void displayInfo(){
        System.out.println("Car: 4 wheels");
    }
}

class Bike extends Vehicle{

    public void displayInfo(){
        System.out.println("Bike: 2 Wheels");
    }

    public static void main(String[] args){
        Vehicle vv = new Vehicle();
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        vv.displayInfo();
        v1.displayInfo();
        v2.displayInfo();
    }
}