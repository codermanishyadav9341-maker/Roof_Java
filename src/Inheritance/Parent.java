package Inheritance;

public class Parent {

    Parent(){
        System.out.println("Parents Constructor Called");
    }
}
class Child extends Parent{

    Child(){
        System.out.println("Child Constructors Called");
    }
    public static void main(String[] args){
        Parent cc = new Child();
    }
}
