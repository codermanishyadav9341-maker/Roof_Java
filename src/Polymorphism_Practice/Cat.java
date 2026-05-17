package Polymorphism_Practice;

public class Cat {
    public void eat(){
        System.out.println("Cat drinks milk");
    }
}

class Cow extends Cat{

    public void eat(){
        System.out.println("Cow eats grass");
    }

    public static void main(String[] args){
        Cow cc = new Cow();
        cc.eat();

    }
}
