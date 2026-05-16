package Polymorphism;

public class Animal {

    public void makeSound(){
        System.out.println("Animal makes Sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat meows");
    }

    public static void main(String[] args){

        Animal a = new Animal();
        a.makeSound();

        Animal a1 = new Cat();
        a1.makeSound();

        Animal a2 = new Dog();
        a2.makeSound();

    }
}
