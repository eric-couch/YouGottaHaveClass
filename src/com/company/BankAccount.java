package com.company;

public class BankAccount {
    private String Owner;
    private String AccountNumber;
    private float balance;

    public BankAccount(String owner, String accountNumber, float balance) {
        Owner = owner;
        AccountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount\n" +
                "Owner='" + Owner + "'\n" +
                "AccountNumber='" + AccountNumber + "'\n" +
                "balance=" + balance +
                "\n";
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float Withdrawl(float amt) {
        if (amt<this.balance) {
            this.balance -= amt;
        }
        return this.balance;
    }

    public float Deposit(float amt) {
        this.balance += amt;
        return this.balance;
    }

    public boolean Transfer(float amt, BankAccount toTransferTo) {
        if (amt < this.getBalance()) {
            this.Withdrawl(amt);
            toTransferTo.Deposit(amt);
            System.out.println("Transferring " + amt + " from " + this.getOwner()
             + "'s account to " + toTransferTo.getOwner() + "'s account.\n");
            return true;
        } else {
            return false;
        }
    }

}
