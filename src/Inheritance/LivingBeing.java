package Inheritance;

public class LivingBeing {
    public void breathe(){
        System.out.println("Breathing..........");
    }
}

class Animal1 extends LivingBeing{
    public void eat(){
        System.out.println("Eating.......");
    }
}

class Dog1 {
    public void bark(){
        System.out.println("Barking.........");
    }

    public static void main(String[] args){
        Dog1 dd = new Dog1();

//        dd.breathe();
//        dd.eat();
//        dd.bark();

    }
}