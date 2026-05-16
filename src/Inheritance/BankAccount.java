package Inheritance;

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
        double updateBalance = initialBalance;

        System.out.println("Deposit:- " +deposit);
        System.out.println("New Balance:- " +updateBalance);

    }

    public static void main(String[] args){
        SavingAccount1 sp = new SavingAccount1(1000,500);
        sp.deposit();
    }
}