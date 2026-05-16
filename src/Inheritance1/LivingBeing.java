package Inheritance1;

public class LivingBeing {

    public void breath(){
        System.out.println("Breathing..........");
    }
}

class Animal2 extends LivingBeing{

    public void eat(){
        System.out.println("Eating........");
    }
}

class Dog1 extends Animal2{

    public void bark(){
        System.out.println("Barking.......");
    }

    public static void main(String[] args){
        Dog1 dd = new Dog1();
        dd.breath();
        dd.eat();
        dd.bark();
    }
}