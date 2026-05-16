package Inheritance1;

public class Parent {

    Parent(){
        System.out.println("Parent Constructor Called");
    }
}

class child extends Parent{

    child(){
        System.out.println("Child Constructor Called");
    }

    public static void main(String[] args){

        child cc = new child();
    }
}