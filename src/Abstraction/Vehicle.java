package Abstraction;

import java.util.Scanner;

abstract class Vehicle {
    String brand;
    double speed;

    Vehicle(String brand,double speed){
        this.brand = brand;
        this.speed  = speed;
    }

    abstract String drive();

    public String toString(){
        return "Brand:- " +brand+  " Speed:- " +speed;
    }
}

class Car extends Vehicle{

    Car(String brand,double speed){
        super(brand,speed);
    }

    public void setSpeed(double speed){
        if(speed <= 0){
            System.out.println("Car is not Start will be positive");
        }
         else if(speed == 0){
             System.out.println("Car is start's but is not running");
        }
          else{
              super.speed = speed;
        }

    }

    String drive(){
        return toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Speed:- ");
        double speed = scan.nextDouble();


        Car vv = new Car("Toyota",25);
        vv.setSpeed(speed);

        System.out.println(vv);


    }
}