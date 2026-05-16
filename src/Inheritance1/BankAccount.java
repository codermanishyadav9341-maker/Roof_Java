package Inheritance1;


public class BankAccount {
    double initialBalance;

    BankAccount(double initialBalance){
        this.initialBalance = initialBalance;
    }

    public void displayBalance(){
        System.out.println("Initial Balance:- " +initialBalance);
    }
}

class SavingAccount1 extends BankAccount{
    double deposit;

    SavingAccount1(double initialBalance,double deposit){
        super(initialBalance);
        this.deposit = deposit;
    }

    public void deposit(){
        super.displayBalance();
        initialBalance += deposit;
        System.out.println("Deposit Balance:- " +deposit);
        System.out.println("New Balance:- " +initialBalance);
    }

    public static void main(String[] args){
       SavingAccount1 bs = new SavingAccount1(5000,2000);
        bs.deposit();
    }
}