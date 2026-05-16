package Encapsulation;

public class Calculator {
    private double result;

    Calculator(){
        this.result = 0;
    }

    public void add(double num){
        result += num;
    }

    public void subtract(double num){
        result -= num;
    }

    public void multiply(double num){
        result *= num;
    }

    public void divide(double num){
        result /= num;
    }

    public double getResult(){
        return result;
    }

    public void clear(){
        result = 0;
    }

    public static void main(String[] args){
        Calculator cc = new Calculator();
        cc.add(10);
        cc.add(5);
//        Add;
        System.out.println("Add:- " +cc.getResult());

//        Subtract;
        cc.subtract(5);
        System.out.println("Subtract:- " +cc.getResult());

        // Multiply;
        cc.multiply(6);
        System.out.println("Multiply:- " +cc.getResult());

        // Divide;
        cc.divide(2);
        System.out.println("Divide:- " +cc.getResult());



    }
}
