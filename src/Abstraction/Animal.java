package Abstraction;

abstract class Animal {
    String name;

    Animal(String name){
        this.name =  name;
    }

    abstract String makeSound();

    void describe(){
       System.out.println("Animal Name:- " +name+ " ,     Sound:- " +makeSound());
    }
}

class Dog extends Animal{
    String sound;
    Dog(String name,String sound){
        super(name);
        this.sound = sound;
    }

    String makeSound(){
        return sound;
    }
}

class Cat extends Animal{
    String sound;
    Cat(String name,String sound){
        super(name);
        this.sound = sound;
    }

    String makeSound(){
        return sound;
    }
}

class Cow extends Animal{
    String sound;

    Cow(String name,String sound){
        super(name);
        this.sound = sound;
    }

    String makeSound(){
        return sound;
    }

    public static void main(String[] args){
        Animal a1 = new Dog("Dog","Bark");
        Animal a2 = new Cat("Cat","Meows");
        Animal a3 = new Cow("Cow","Bha");


       a1.describe();
       a2.describe();
       a3.describe();



    }
}
