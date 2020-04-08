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

        if (ericsCheckingAccount.getBalance() > markSavingsAccount.getBalance()) {
            System.out.println("Eric's account is larger");
        } else if (ericsCheckingAccount.getBalance() < markSavingsAccount.getBalance()) {
            System.out.println("Mark's account is larger");
        } else {
            System.out.println("The accounts are the same.");
        }

        System.out.printf(aprilsAccount.getOwner() + "'s account has a balance of $%,.2f\n",
                aprilsAccount.getBalance());

        markSavingsAccount.Transfer(10000.00f, ericsCheckingAccount);

        System.out.println(ericsCheckingAccount.toString());
        System.out.println(markSavingsAccount.toString());
    }
}
