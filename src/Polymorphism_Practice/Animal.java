package Polymorphism_Practice;

public class Animal {

    public void Sound(){
        System.out.println("Animal has Different Sound");
    }

}

class Dog extends Animal{

    @Override
    public void Sound(){
        System.out.println("Dog barks");
    }

    public static void main(String[] args){
        Dog dd = new Dog();
        dd.Sound();

    }
}
