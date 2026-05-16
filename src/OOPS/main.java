package OOPS;

import OOPS.BankAccount;
public class main {
    public static void main(String[] args){
        BankAccount bb = new BankAccount("man982105",4567);
        bb.deposit(5000);
        bb.withDraw(1000);
        bb.checkBalance(4567);

    }
}
