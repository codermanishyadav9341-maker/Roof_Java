package Inheritance;

public class Animal3 {

    public void eat4(){
        System.out.println("Animal is eating........");
    }
}

class Cat extends Animal{

    public void eat4(){
        System.out.println("Cat is eating.....");
    }

    public void sound1(){
        System.out.println("Cat meows");
    }

    public static void main(String[] args){
        Cat cc = new Cat();
        cc.eat4();
        cc.sound1();
    }
}