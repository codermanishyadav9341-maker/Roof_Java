package Polymorphism_Practice;

public class Sum {

    public void sum(int a,int b){
        System.out.println("Sum of a && b is:- " +(a+b));
    }

    public void sum(int a,int b,int c){
        System.out.println("Sum of a , b && c is:- " +(a+b+c));
    }

    public static void main(String[] args){
        Sum ss = new Sum();
        ss.sum(10,20);
        ss.sum(10,20,30);

    }
}
