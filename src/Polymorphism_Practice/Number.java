package Polymorphism_Practice;

public class Number {

    public void display(){
        System.out.println("Default Value");
    }

    public void display(int num){
        System.out.println("Value of num is:- " +num);
    }

    public static void main(String[] args){
        Number nn = new Number();
        nn.display();
        nn.display(10);
    }
}
