package Inheritance1;

public class Account {
    double balance;

    Account(double balance){
        this.balance = balance;
    }


    public void showBalance(){
        System.out.println("Balance:- " +balance);
    }
}

class SavingAccount extends Account{
    double interestRate;

    SavingAccount(double balance,double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }


    public void showBalance(){
        super.showBalance();
        double interest = (balance*interestRate)/100;
        balance += interest;
        System.out.println("Interest:- " +interest);
        System.out.println("Balance with interestRate:- " +balance);
    }

    public static void main(String[] args){
        Account aa = new SavingAccount(5000,5);
        aa.showBalance();
    }
}
