package Polymorphism_Practice;

public class Add {

    public int add(int a,int b){
        return a+b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public float add(float a,float b){
        return a+b;
    }

    public static void main(String[] args){
        Add add = new Add();

        System.out.println("Add Integer:- " +add.add(10,20));
        System.out.println("Add Double:- " +add.add(10.0,5.0));
        System.out.println("Add Float:- " +add.add(10,20.F));
    }
}
