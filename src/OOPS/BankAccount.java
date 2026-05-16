package OOPS;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private int pin;


//     Constructors;

    BankAccount(String accountNumber,int pin){
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = 0;
    }

    public void deposit(double amount){
        if(amount >= 0){
            balance += amount;
        }
         else{
             System.out.println("Balance cannot be negative");
        }
    }

    public void withDraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Sufficient balance:- " +balance);
        }
         else{
             System.out.println("Insufficient Balance");
        }

    }

    public void checkBalance(int pin){

        if(this.pin == pin){
            System.out.println("Balance:- " +balance);
        }
         else{
             System.out.println("Invalid pin");
        }
    }

    public void changePin(int oldPin,int newPin){
 if(this.pin == oldPin) {
        if(newPin >= 1000 && newPin <= 9999){
            this.pin = newPin;
            System.out.println("Pin change Successfully");
        }
         else{
             System.out.println("New must be 4 digits");
        }
 }
  else{
      System.out.println("Pin Changed please new pin");
 }

    }
}
