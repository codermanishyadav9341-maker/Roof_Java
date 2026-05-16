package Encapsulation;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;


    BankAccount(String accountNumber,String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
        }
         else{
             System.out.println("Amount must be positive cannot be negative");
        }
    }


    public void withdraw(double amount){
        if(amount < 0){
            System.out.println("Withdraw amount must be Positive");
        }
         else if(amount > balance){
             System.out.println("Insufficient Balance");
        }
          else{
              balance -= amount;
              System.out.println("WithDraw Amount:- " +amount);
              System.out.println("Successful WithDraw");
              System.out.println("New Balance:- " +balance);
        }
    }


    public void transfer(BankAccount otherAccount,double amount){
       if(amount <= 0){
           System.out.println("Amount must be Positive");
       }
        else if(amount > balance){
            System.out.println("Insufficient Balance");
       }
        else{
            this.balance -= amount;
            otherAccount.deposit(amount);
            System.out.println("Transfer Successful:- " +amount);
       }
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args){
        BankAccount bb = new BankAccount("ACC982105","Manish Kumar");
        BankAccount bb1 = new BankAccount("ACC934196","Ronit Raj");
        bb.deposit(5000);
        bb.withdraw(500);
        bb.transfer(bb1,1000);

        System.out.println("------------------=:Bank Account:=--------------------");
        System.out.println("AccountHolder Name:- " +bb.getAccountHolderName());
        System.out.println("Account Number:- " +bb.getAccountNumber());
        System.out.println("Balance:- " +bb.getBalance());

        System.out.println("Receive Name:- " +bb1.getAccountHolderName());
        System.out.println("Receive Balance:- " +bb1.getBalance());


    }
}



