package Inheritance1;

public class Animal {

    public void makeSound(){
        System.out.println("Animal has different Sound");
    }
}

class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }

    public static void main(String[] args){
       Animal dd = new Dog();
        dd.makeSound();

    }
}
