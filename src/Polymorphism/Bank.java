package Polymorphism;

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
        ICICI cc = new ICICI();
        cc.getInterestRate();

        HDFC hd = new HDFC();
        hd.getInterestRate();

        SBI sb = new SBI();
        sb.getInterestRate();


        System.out.println("----------------:Different Bank for Different InterestRate:--------------");
        System.out.println("SBI Interest Rate:- " +sb.getInterestRate()+ "%");
        System.out.println("HDFC Interest Rate:- " +hd.getInterestRate()+ "%");
        System.out.println("ICICI Interest Rate:- " +cc.getInterestRate()+ "%");

    }
}

