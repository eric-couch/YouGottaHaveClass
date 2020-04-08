package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount ericsCheckingAccount =
                new BankAccount("Eric Couch", "000000001", 10000.00f);
        BankAccount markSavingsAccount =
                new BankAccount("Basem Hunein", "000000002", 50000.00f);
        BankAccount aprilsAccount =
                new BankAccount("April Tillis", "000000003", 12356709.00f);

        System.out.println(ericsCheckingAccount.toString());
        System.out.println(markSavingsAccount.toString());
        System.out.println(aprilsAccount.toString());

        ericsCheckingAccount.Deposit(10000.00f);
        markSavingsAccount.Deposit(5000.00f);
        aprilsAccount.Withdrawl(5000.00f);

        System.out.println(ericsCheckingAccount.toString());
        System.out.println(markSavingsAccount.toString());
        System.out.println(aprilsAccount.toString());
    }
}
