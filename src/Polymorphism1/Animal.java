package Polymorphism1;

public class Animal {

    public void makeSound(){
        System.out.println("Animals makes Sound");
    }
}

class Dog extends Animal{

    public void makeSound(){
        System.out.println("Dogs Barks");
    }
}

class Cat extends Animal{

    public void makeSound(){
        System.out.println("Cat meows");
    }

    public static void main(String[] args){
        Animal aa = new Animal();
        Animal dd = new Dog();
        Animal cc = new Cat();

        aa.makeSound();
        dd.makeSound();
        cc.makeSound();

    }
}