package Inheritance;

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

    @Override
    public void showBalance(){
        super.showBalance();
        double interest = balance * interestRate;
        balance  += interest;
        System.out.println("Balance with InterestRate:- " +balance);
    }

    public static void main(String[] args){
        Account aa = new SavingAccount(5000,0.5);
        aa.showBalance();
    }
}