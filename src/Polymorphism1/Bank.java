package Polymorphism1;

public class Bank {

    public int getInterestRate(){
        return 0;
    }
}

class SBI extends Bank{

    public int getInterestRate(){
        return 5;
    }
}

class HDFC extends Bank{

    public int getInterestRate(){
        return 6;
    }
}

class ICICI extends Bank{

    public int getInterestRate(){
        return 7;
    }

    public static void main(String[] args){
        Bank bb = new Bank();
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("-------------=:INTEREST RATE:=----------------");
        System.out.println("Bank:- " +bb.getInterestRate()+"%");
        System.out.println("SBI Bank:- " +b1.getInterestRate()+"%");
        System.out.println("HDFC Bank:- " +b2.getInterestRate()+"%");
        System.out.println("ICICI Bank:- " +b3.getInterestRate()+"%");


    }
}