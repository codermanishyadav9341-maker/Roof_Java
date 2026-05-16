package Polymorphism;

public class Greeter {

    public void greet(){
        System.out.println("Hello");
    }

    public void greet(String name){
        System.out.println("Hello " +name);
    }

    public void greet(String time,String name){
        System.out.println(time+ " " +name);
    }

    public static void main(String[] args){
        Greeter gg = new Greeter();
        gg.greet();
        gg.greet("Manish");
        gg.greet("Good AfterNoon","Manish");

    }
}
